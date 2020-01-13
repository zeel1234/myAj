<html>
   <head>
      <title>Using GET Method to Read Form Data</title>
   </head>
   
   <body>
      <h1>Student Report Card  </h1>
      <ul>
         <li><p><b> Name:</b>
            <%= request.getParameter("sname")%>
         </p></li>
         <li><p><b>Data Mining :</b>
            <%= request.getParameter("dm")%>
         </p></li>
          <li><p><b>Advanced Java </b>
	             <%= request.getParameter("aj")%>
         </p></li>
          <li><p><b>ADVANCED DBMS  :</b>
	             <%= request.getParameter("adbms")%>
         </p></li>
          <li><p><b>APT:</b>
	             <%= request.getParameter("apt")%>
         </p></li>
        
            <li><p><b>OOSD :</b>
	 	             <%= request.getParameter("oosd")%>
         </p></li>
      </ul>
     <%
     String dm = request.getParameter("dm");
     String aj = request.getParameter("aj");
     String apt = request.getParameter("apt");
     String oosd = request.getParameter("oosd");
     String adbms = request.getParameter("adbms");
     
     int dmmarks = Integer.parseInt(dm);
     int ajmarks = Integer.parseInt(aj);
     int aptmarks = Integer.parseInt(apt);
     int oosdmarks = Integer.parseInt(oosd);
     int adbmsmarks = Integer.parseInt(adbms);
     
         int total = dmmarks+ajmarks+aptmarks+oosdmarks+adbmsmarks;
         int avg = total/5;
         double percent = (total / 500.00) * 100;
%> 
<b>TOTAL </b>
<%=total %>
<b>average </b>
<%=avg %>

<b>PERCENTAGE </b>
<%=percent %>
  
   </body>
</html>