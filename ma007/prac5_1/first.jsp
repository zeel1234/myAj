<html>
   <head>
      <title>Using GET Method to Read Form Data</title>
   </head>
   
   <body>
      <h1>Using GET Method to Read Form Data</h1>
      <ul>
         <li><p><b> Name:</b>
            <%= request.getParameter("sname")%>
         </p></li>
         <li><p><b>Semester :</b>
            <%= request.getParameter("sem")%>
         </p></li>
          <li><p><b>Date Of Birth :</b>
	             <%= request.getParameter("sdob")%>
         </p></li>
          <li><p><b>Gender :</b>
	             <%= request.getParameter("gen")%>
         </p></li>
          <li><p><b>Country :</b>
	             <%= request.getParameter("country")%>
         </p></li>
        
          <li><p><b>Cureent Date And Time  :</b>
	              <%= (new java.util.Date()).toLocaleString()%>
         </p></li> 
            <li><p><b>SSC :</b>
	 	             <%= request.getParameter("ssc")%>
         </p></li>
            <li><p><b>HSC :</b>
	 	             <%= request.getParameter("hsc")%>
         </p></li>
            <li><p><b>BCA :</b>
	 	             <%= request.getParameter("bca")%>
         </p></li>
      </ul>
     
  
   </body>
</html>