package com.sohamglobal.fileuploaddemo.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class SohamController {
	
	@Value("${file.upload-dir}")
    private String uploadDir;
	
	@GetMapping("/")
	public String homePage()
	{
		return "index.jsp";
	}
	
	@PostMapping("/check")
	public String check(String username,String password,HttpSession ses)
	{
		if(username.equals("sharayu") && password.equals("spider"))
		{
			ses.setAttribute("loginstatus", "success");
			return "Admin.jsp";
		}
		else
			return "Failure.jsp";
	}
	
	@PostMapping("/upload")
	//@ResponseBody
    public String handleFileUpload(@RequestParam("file") MultipartFile file,Model m) {
        String msg="";
		String fileName="";
		if (file.isEmpty()) {
            msg="Please select a PDF file to upload.";
        }

        try {
            fileName = file.getOriginalFilename();
            File dest = new File(uploadDir + File.separator + fileName);

            // Create directories if not exist
            dest.getParentFile().mkdirs();

            file.transferTo(dest);
            msg="File uploaded successfully";
        } catch (IOException e) {
            e.printStackTrace();
            msg="File upload failed!";
        }
        m.addAttribute("msg", msg);
        m.addAttribute("filename", fileName);
	return "UploadStatus.jsp";
	}
	
	@GetMapping("/admin")
	public String admin(HttpSession ses)
	{
		if(ses.getAttribute("loginstatus")!=null)
			return "Admin.jsp";
		else
			return "Failure.jsp";
	}
	
	@GetMapping("/files")
    public String listUploadedFiles(Model model) {
        File folder = new File(uploadDir);
        File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));

        List<String> fileNames = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                fileNames.add(file.getName());
            }
        }

        model.addAttribute("files", fileNames);
        return "FileList.jsp"; 
    }
	
	
	@GetMapping("/view/{filename:.+}")
	public ResponseEntity<Resource> viewPdf(@PathVariable String filename) throws IOException {
	    File file = new File("C:/uploads/" + filename);

	    if (!file.exists() || !file.getName().toLowerCase().endsWith(".pdf")) {
	        return ResponseEntity.notFound().build();
	    }

	    InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

	    return ResponseEntity.ok()
	            .contentType(MediaType.APPLICATION_PDF)
	            .header("Content-Disposition", "inline; filename=\"" + filename + "\"")
	            .body(resource);
	}
	
}
