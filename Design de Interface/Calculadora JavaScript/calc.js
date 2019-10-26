function limpar(){
    document.getElementById('visor').value = "";
}
function add(valor){
    document.getElementById('visor').value += valor;
}
function calcular(){
    var resultao = 0;
    resultado = document.getElementById('visor').value;

    document.getElementById('visor').value = '';

    document.getElementById('visor').value = eval(resultado);
}