
/**Revertir una cadena de texto. */
function InvertirCadena(texto){
    let resultado= "";
    for(let i = texto.length -1; i >=0; --i){
        resultado+= texto[i]
    }
    return resultado;
}

console.log(InvertirCadena("hola"));