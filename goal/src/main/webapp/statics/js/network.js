function networkmeasurement(networkgood,networkordinary,networkerror)
    {
		
		var count=3;
		 setInterval(function () {
			 var date1=new Date();
            $.ajax({
                type: "GET",
                url: "http://www.w3cschool.cc/try/ajax/jsonp.php?jsoncallback=?",
               dataType: 'jsonp',
				jsonp: 'jsoncallback',
				data: null, 
				timeout: 5000,				 
				contentType: "application/json;utf-8",
				success: function (result) { 
				var date2= new Date();
				var date3=date2.getTime()-date1.getTime();
				
				if(date3<1000){
					++count;
					}else if(date3>1000&&date3<2000){
						--count;
					}else{
						count=0;	
				}

				if(count>=3){
					networkgood();
					}else if(count<3&&count>0){
						networkordinary()
						}else if(count<=0){
							networkerror();
							}
				}, 
				error: function (jqXHR, textStatus, errorThrown) { 
				networkerror();
				} 
            });
        },5000);
    }
   