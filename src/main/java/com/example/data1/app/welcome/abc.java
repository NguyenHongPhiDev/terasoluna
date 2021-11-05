package com.example.data1.app.welcome;

import com.example.data1.domain.model.UserModel;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Iterator;

@MultipartConfig
@Controller
public class abc {
    @RequestMapping(value = "/abc",method = RequestMethod.GET)
    public String createForm(@ModelAttribute("abcForm") AbcForm form,
                             Model model) {
        return "login/index1";
    }
    @RequestMapping("/abd")
    public String createForm1(@ModelAttribute("abcForm") AbcForm form,
                             Model model) {
        String  messenger = "";
        model.addAttribute("mess",messenger);
        return "login/index2";
    }
    @RequestMapping(value = "/upload",method = {RequestMethod.POST,RequestMethod.GET},consumes = {MediaType.MULTIPART_FORM_DATA_VALUE
            ,MediaType.APPLICATION_FORM_URLENCODED_VALUE},
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String createForm3(@RequestParam("img") MultipartFile file){
        String name = uploadFile(file);
        System.out.println(name);
        return name;
    }
    @RequestMapping("/update/img")
    public String loadanh() {
        return "login/index3";
    }
//    @RequestMapping(value = "/abc/update",method = {RequestMethod.POST,RequestMethod.GET})
//    public String createForm1(@ModelAttribute("abcForm") AbcForm form,
//                              @RequestParam(value = "img",required = false)MultipartFile img){
//        System.out.println(form.getAbc());
//        MultipartFile abc = form.getImg();
//        System.out.println(abc);
//        String nameFile = uploadFile(img);
//        form.setNameFile(nameFile);
//        System.out.println(nameFile);
//        return "login/index3";
//    }
    private String uploadFile(MultipartFile file){
        if(null!= file && !file.isEmpty()){
            try {
                byte[] bytes = file.getBytes();
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath+ File.separator + "assets/user/images");
                if (!dir.exists())
                    dir.mkdirs();
                String name = String.valueOf(new Date().getTime()+".jpg");
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + name);
                System.out.println("=================" +serverFile.getPath());
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
//                return serverFile.getPath();
                return name;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("==================");
        }
        return null;
    }

}
