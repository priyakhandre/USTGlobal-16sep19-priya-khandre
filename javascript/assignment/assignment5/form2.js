function checkLength(){
    let unamel=document.getElementById("usernametb").value.trim().length;
    let pswl=document.getElementById("passwordtb").value.trim().length;
    console.log(unamel,pswl)
    if(unamel <= 5){
        document.getElementById("unamep").style.color="red"
        document.getElementById("unamep").style.fontSize="5px"

        document.getElementById("unamep").textContent="min 5 character"
        document.getElementById("login").disabled=true;
    }
    else{
        document.getElementById("unamep").textContent=""
    }
    if(pswl<=5){
        document.getElementById("pswdp").style.fontSize="5px";
        document.getElementById("pswdp").style.color="red"

        document.getElementById("pswdp").textContent="min 5 character"
        document.getElementById("login").disabled=true;
    }
    else
        document.getElementById("pswdp").textContent=""; 
        if(unamel >5 && pswl >5) {
            console.log("success")
        document.getElementById("login").disabled=false  }
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
