function verificarCadena() {
    const input = document.getElementById('inputUsuario').value;

    const longitud = input.length;

    if (longitud > 10) {
        const resultado = input.substring(10);
        alert(resultado);
    } else {
        alert("La cadena es menor o igual a 10 caracteres.");
    }
}