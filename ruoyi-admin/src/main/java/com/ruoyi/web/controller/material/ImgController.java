package com.ruoyi.web.controller.material;


import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Base64;
import java.util.UUID;

@RestController
@RequestMapping("/image_recognition")
public class ImgController {
    @PostMapping("/updateAvatarUrl")
    public JSONObject updateAvatarUrl(@RequestParam("image") MultipartFile multipartFile) throws IOException {

        String filePath = "C:\\Users\\Administrator\\Desktop\\mydemo\\mydemo\\resources\\received_images\\"; //定义上传文件的存放位置

        String fileName=multipartFile.getOriginalFilename();//获取到上传文件的名字
        String AbsolutePath = "C:\\Users\\Administrator\\Desktop\\mydemo\\mydemo\\resources\\received_images\\"+fileName;
        //System.out.println(multipartFile.getName());//获取到file
        File dir = new File(filePath, fileName);
        //System.out.println(multipartFile.getSize());
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        multipartFile.transferTo(dir);

        JSONObject object = new JSONObject();  //创建Json对象
        try {
            //这里是Java调用python的位置
            //格式：String[] args = new String[] { "python.exe的位置", “python文件的位置”, 数据};

            String[] strings = new String[]{"C:\\Users\\Administrator\\AppData\\Local\\Programs\\Python\\Python38\\python.exe", "C:\\Users\\Administrator\\Desktop\\mydemo\\mydemo\\image.py", AbsolutePath};
            Process proc = Runtime.getRuntime().exec(strings);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(), "gb2312"));


            //如果有错，把报错信息输出，来查看错误：
            /*
            BufferedReader error = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String err = null;
            while ((err = error.readLine()) != null) {
                System.out.println("=====error：" + err);
            }
*/

            String line = null;
            line = in.readLine();
            object.put("base64", line);
            line = in.readLine();
            object.put("are_sum_bfb", line);
            line = in.readLine();
            object.put("Area", line);
            line = in.readLine();
            object.put("Perimeter", line);
            line = in.readLine();
            object.put("Elongation", line);
            line = in.readLine();
            object.put("Boxivity", line);
            line = in.readLine();
            object.put("Circular_Equiv_Diameter", line);


            return object;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        object.put("异常", "您提交的图片不符合要求或算法异常");
        return object;
    }

    @PostMapping("/updateAvatarUrl2")
    public JSONObject updateAvatarUrl2(@RequestParam("image")String filepath) throws IOException {

        //filepath实例：HD\0900_0900.tif
        String path0="C:\\Users\\Administrator\\Desktop\\tomcat\\webapps\\";
        System.out.println(path0+filepath);

        JSONObject object = new JSONObject();  //创建Json对象
        try {
            //这里是Java调用python的方法
            //格式：String[] args = new String[] { "python.exe的位置", “python文件的位置”, 数据};
            String[] strings = new String[]{"C:\\Users\\Administrator\\AppData\\Local\\Programs\\Python\\Python38\\python.exe", "C:\\Users\\Administrator\\Desktop\\mydemo\\mydemo\\image.py", path0+filepath};
            Process proc = Runtime.getRuntime().exec(strings);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(), "gb2312"));


            //如果有错，把报错信息输出，来查看错误：
            /*
            BufferedReader error = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
            String err = null;
            while ((err = error.readLine()) != null) {
                System.out.println("=====error：" + err);
            }
*/

            String line = null;
            line = in.readLine();
            object.put("base64", line);
            line = in.readLine();
            object.put("are_sum_bfb", line);
            line = in.readLine();
            object.put("Area", line);
            line = in.readLine();
            object.put("Perimeter", line);
            line = in.readLine();
            object.put("Elongation", line);
            line = in.readLine();
            object.put("Boxivity", line);
            line = in.readLine();
            object.put("Circular_Equiv_Diameter", line);


            return object;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        object.put("异常", "您提交的图片不符合要求或算法异常");
        return object;
    }



    public static String generateImage(String base64, String path) {
        // 解密
        try {

            //这是保存文件的位置
            String savePath = "C:\\Users\\Administrator\\Desktop\\mydemo\\mydemo\\resources\\received_images\\";
            // 图片分类路径+图片名+图片后缀
            String imgClassPath = path.concat(UUID.randomUUID().toString()).concat(".jpg");
            // 去掉base64前缀 data:image/jpeg;base64,
            base64 = base64.substring(base64.indexOf(",", 1) + 1);
            // 解密，解密的结果是一个byte数组
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] imgbytes = decoder.decode(base64);
            for (int i = 0; i < imgbytes.length; ++i) {
                if (imgbytes[i] < 0) {
                    imgbytes[i] += 256;
                }
            }

            // 保存图片
            OutputStream out = new FileOutputStream(savePath.concat(imgClassPath));
            out.write(imgbytes);
            out.flush();
            out.close();
            // 返回图片的相对路径 = 图片分类路径+图片名+图片后缀
            return imgClassPath;
        } catch (IOException e) {
            //System.out.println(e);
            return null;
        }
    }

}
