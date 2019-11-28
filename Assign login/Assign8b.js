function checkLength(){
    let unamel=document.getElementById("usernametb").value.trim().length;
    let pswl=document.getElementById("passwordtb").value.trim().length;
    console.log(unamel,pswl)
    if(unamel>=5 && pswl>=5){
        console.log("hello")
        document.getElementById("login").disabled="false";
    }
    else{
        document.getElementById("login").disabled="true";    
    }
}
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
