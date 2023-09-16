/* Verificar si un número es primo.*/ 

let numero= parseInt(prompt("ingresa un numero: "));
let divisor = 1, contador =0;
while(divisor <= numero){
    if (numero% divisor ==0) {
        contador++
    }
    divisor++
}
contador == 2 ? document.write("El nuemro es primo "): document.write("El numero no es primo");