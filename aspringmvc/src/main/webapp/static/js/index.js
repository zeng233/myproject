$(this).ready(function() {
	
	$.ajax({
	   type: "get",
	   url: "test/format",
	   success: function(data){
		 $("#result").text(data.count);
	   }
	});
});


