$().ready(function() {
					$("#signin-btn").click(function() {
						var username = $("#login_id").val();
						if (username.length == 0) {
							alert("请输入用户名 ");
						} else {
							$.post("select.do", {
								username : username
							}, function(data) {
								alert(data);
							});
						}
					});

					$("#btn02").click(function() {
								var userid = $("#userid").val();

								$.post("ajaxuser.do", {
									userid : userid
								}, function(data) {
									alert(data.userid + "---" + data.username
											+ "---" + data.password);
								}, "json");

							});

				});