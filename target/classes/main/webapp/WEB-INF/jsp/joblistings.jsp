<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="../common/header.jsp" />
<style type="text/css">
body {
	padding-top: 50px;
}

.starter-template {
	padding: 40px 15px;
	text-align: center;
}

.center {
	margin-left: auto;
	margin-right: auto;
	width: 50%;
}
</style>

<script type="text/javascript">
	$(document).ready(function() {

		$('#myModal').on('shown.bs.modal', function(event) {

			var button = $(event.relatedTarget) // Button that triggered the modal
			var id = button.data('id')
			$('#jobId').val(id);

		});

	});
</script>


</head>



<body>

	<div class="container">

		<h2>
			<b><font color="orange">Job Listings</font></b>
		</h2>
		<hr style="border-bottom: 1px black;" />
		<c:forEach items="${jobs}" var="job">
			<table border="0" width="100%"
				style="padding: 8px; vertical-align: top">
				<thead>
					<tr>

						<td colspan="3" align="left">
							<%-- 						<input type="hidden" id="jobid"	value="${job.id}" />  --%>
							<label style="color: activecaption; font-size: 150%;"
							id="jobTitle">${job.jobTitle}</label>
						</td>

						<td colspan="1" align="right"><button type="button"
								class="btn btn-primary btn-sm btn-apply" data-toggle="modal"
								data-id="${job.id}" data-target="#myModal">Apply</button></td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td id="jobDescription">${job.jobDescription}</td>

					</tr>
					<tr>
						<td>By <label style="color: blue"> ${job.postedBy} </label></td>
					</tr>

				</tbody>
			</table>
			<hr />
		</c:forEach>




		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
			
				<form:form method="POST" action='<%=request.getContextPath() + "/applyJob.html"%>' commandName="apply" id="form">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">Do you want to
								apply ?</h4>
						</div>
						<div class="modal-body">

							<div class="form-group">
								<label for="InputMessage">Done anything related to this
									job?</label>
								<div class="input-group">
									<input type="hidden" id="jobId" name="jobId" value=""></input>
									<textarea name="portfolio" id="InputMessage"
										class="form-control" rows="5"></textarea>

									<span class="input-group-addon"><span
										class="glyphicon glyphicon-asterisk"></span></span>
								</div>
							</div>

						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<input type="submit" class="btn btn-primary btn-submit"></input>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<!-- Close container -->
</body>
</html>