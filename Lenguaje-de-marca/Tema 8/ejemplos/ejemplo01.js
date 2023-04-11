function buscarEnlaces(){

    let enlace = document.getElementById('enlaceColegio')
    alert(enlace.href); //enseña atributo href
    //alert(enlace.innerHTML); //contenido de la etiqueta
}

buscarEnlaces();


function buscarEnlaces(){

    let enlace = document.querySelector('#enlaceColegio')
    alert(enlace.innerHTML)

    let parrafos = document.querySelectorAll('a+p');
    for(let parr of parrafos){
        alert(parr.innerHTML)
    }
}
buscarEnlaces();

