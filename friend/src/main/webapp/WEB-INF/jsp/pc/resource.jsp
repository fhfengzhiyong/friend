		<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;  
%>  
		<script src="<%=basePath%>/static/jquery/jquery.min.js"></script>
		<script src="<%=basePath%>/static/easyui/jquery.easyui.min.js"></script>
		<script src="<%=basePath%>/static/js/friend.js"></script>
		<script src="<%=basePath%>/static/js/login.js"></script>
		<script src="<%=basePath%>/static/bootcss/bootstrap.min.js"></script>
		<script type="text/javascript" src="<%=basePath%>/static/js/jquery.form.js"></script>
		<script type="text/javascript" src="<%=basePath%>/static/js/tooltips.js"></script>
		<script src="<%=basePath%>/static/js/supersized.3.2.7.min.js"></script>
		<script src="<%=basePath%>/static/js/supersized-init.js"></script>
		<script src="<%=basePath%>/static/js/scripts.js"></script>
		<link rel="stylesheet" href="<%=basePath%>/static/css/supersized.css">
		<link rel="stylesheet" href="<%=basePath%>/static/css/login.css">
		<link href="<%=basePath%>/static/bootcss/css/bootstrap.min.css" rel="stylesheet">
		