
<%
	String errorBadCredentials = (String) request.getAttribute("CredenzialiErrate");
	if (errorBadCredentials != null) {
		out.println("<p class=error>" + errorBadCredentials + "</p>");
	}
%>
<%
	String errorCampiVuoti = (String) request.getAttribute("CampiVuoti");
	if (errorCampiVuoti != null) {
		out.println("<p class=error>" + errorCampiVuoti + "</p>");
	}
%>

