$(function() {
	$("#testUsername").focusout(function() {
		var username = $("#testUsername").val();
		alert(username);
		$.ajax({
			type: "POST",
			url: "ajax/username",
			data: "name=" + username,
			success: function(msg){
		    	alert( "msg: " + msg );
				$("#error").html(msg);
		   }
		});
	});
	
	
});