         let h1Element =document.getElementById('demo')
console.log('element =',h1Element ) // if script is in body then it shows output else element value is null
console.log('element text=',h1Element.textContent) // it will show the text content
h1Element.textContent = 'good evening'
// create elements dynamically
let buttonElement = document.createElement('button')
buttonElement.textContent = 'click me' 
console.log('button element', buttonElement)


///
document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent ='java'
li2Element.textContent ='sql' 
li3Element.textContent ='javascript'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color = 'red'
h1Element.style.fontSize = '20px'



function showMessage() {
    alert('hi hello welcome ')
}

//

function changeColor() {
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green'
}
//
function printHello() {
    //console.log('hello')

    let userName = document.getElementById('userName').value   //taking value from user
    document.getElementById('showUserName').textContent = userName;
}


let name = 'priya'
let age = 21
let phone = 7795550908
console.log ('name is ' +name + 'age is' + age + 'phone is' + phone )
console.log(`name is ${name} age is ${age} phone no is ${phone}`)
console.log(`2 +2 = ${2+2}`)





