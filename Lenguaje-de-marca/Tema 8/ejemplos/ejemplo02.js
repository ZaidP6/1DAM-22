
function buscarEnlaces(){ 

    //let enlace = document.getElementById('enlaceColegio')
    let enlace = document.querySelector('#primerEnlace')
    alert(enlace.innerHTML)

    let enlaces = document.querySelectorAll('a');
    for(let enlace of enlaces){
        enlace.nextElementSibling.innerHTML = "Hola hola";

        //enlace.children[3].nextElementSibling.innerHtml;  

        let siguienteParrafo = enlace.nextElementSibling;
        let primerHijoDelParrafo = siguienteParrafo.children[0];
    }
}

function crearParrafo(contenido){
    let parrafoNuevo = document.createElement('p');
    parrafoNuevo.innerHTML = contenido;

    let elBody = document.querySelector('body');
    elBody.append(parrafoNuevo);
}

crearParrafo(prompt('¿Qué quieres escribir?'));

