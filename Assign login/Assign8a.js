function showPswd(){
   let type1=document.getElementById("passwordtb").type
   if(type1=='password'){
    let psw=document.getElementById("passwordtb").value
    console.log(psw);
    document.getElementById("passwordtb").type="text"
    document.getElementById("passwordtb").textContent=psw;
   }
   else{
    document.getElementById("passwordtb").type="password"
   }
  
   }