
let login = () =>{
	var params = new URLSearchParams();
	const url = "/login.do";
	params.append('id', $("#id").val());
	params.append('passwd', $('#passwd').val());
	
	axios.post(url, params).then(response=>{
		console.log(response.data.login);
		if(response.data.login){
			alert("로그인성공");
		}else{
			alert("로그인실패");
		}
	});
}

/*
let axiosTest = () => {
	const url = "/boardTest/axiosTest";
	var params = new URLSearchParams();
	//alert("id: " + $("#id").val());
	params.append('id', $("#id").val());
	
	axios.post(url, params).then(response=>{
		console.log("res: "+response.id);
		console.log(response);
		//response의 데이터 ㅈㅔ이슨형식의 데이터의 id값을 받아오는 것.
		console.log("data.data: "+response.data.id);
		console.log(response.data);  //Object
		console.log("Stringfy : " + JSON.stringify(response.data)); //Json String 형변환!!
	
	});
*/
	//console.log(id);


	/*
	let body = new URLSearchParams();

	body.append("id", $("#id").val());
	body.append("id", $("#pw").val());
	 */

	/*	axios.post(		
			url,{
				params:
			{
				id:'nikki'
			}}
			).then(res=>{
			alert(res.data);
		})*/
