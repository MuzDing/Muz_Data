package com.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



public class UploadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6483558339095298703L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO 自动生成的方法存根
		//判断是否以流形式提交
		boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		//文件上传目录
		String fpath = req.getServletContext().getRealPath("upload");
		System.out.println(fpath);
		File f = new File(fpath);
		if(!f.exists()){
			f.mkdir();
		}
		if(isMultipart){
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			
			List<FileItem> items = null;
			try{
				items = upload.parseRequest(req);
			}catch(FileUploadException e){
				e.printStackTrace();
			}
			for(FileItem fileItem:items){
				//核心代码
				if(!fileItem.isFormField()){
					File fullFile = new File(fileItem.getName());
					Date d = new Date();
					File uploadFile = new File(fpath,d.getTime()+fullFile.getName());
					try{
						fileItem.write(uploadFile);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自动生成的方法存根
		doGet(req, resp);
	}

	

}
