function pedirNombres(){
	let salir = false;
	let listaNombres = [];
	do{
		let nombre = prompt('Indique un nombre');
		if(isNaN(nombre)){
			listaNombres.push(nombre);			
		}else{
			salir = true;
		}
	}while(!salir);	

	return listaNombres;
}

function camelize(str){
	let palabras = str.split('-');
	for(let i=1;i<palabras.length;i++){ //la primera palabra no se toma en consideración
		let palabra = palabras[i];
		let primeraLetra = palabra.charAt(0).toUpperCase(); //se toma la primera letra y se pasa a mayúscula
		palabra = primeraLetra.concat(palabra.substring(1)); //se concatena la primera letra al resto de la cadena
		palabras[i]=palabra; //se sustituye la palabra en el array
	}
	return palabras.join('');
}

function sortear(arr){
	//la forma de obtener un número entero aleatorio comprendido entre un mínimo (incluido) y un máximo (excluido) es
	//Math.floor(Math.random() * (max - min)) + min;
	//en este caso, hay que elegir uno entre 0 y arr.length

	let numAleatorio = Math.floor(Math.random() * arr.length);

	return arr[numAleatorio];
}

function principal(){
	let nombres = pedirNombres();

	for(let i=0;i<nombres.length;i++){	
		nombres[i] = camelize(nombres[i]);
	}

	alert('El miembro escogido es '+sortear(nombres));
}

principal();