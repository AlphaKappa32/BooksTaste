<jsp:useBean id="user" class="com.bookstaste.bookstaste.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"/>

First Name: <jsp:getProperty name="user" property="f_name"/>
<br/>
Surname: <jsp:getProperty name="user" property="s_name"/>
<br/>
Date of birth: <jsp:getProperty name="user" property="date_of_birth"/>
<br/>
Username: <jsp:getProperty name="user" property="username"/>
<br/>
Email: <jsp:getProperty name="user" property="email"/>
<br/>
Password: <jsp:getProperty name="user" property="password"/>

