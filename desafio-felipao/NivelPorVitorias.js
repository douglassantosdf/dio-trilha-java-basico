let saldoVitorias = calcVitorias(16 , 5)
let rankAtual = 0

function calcVitorias(numA, numB) {
  let somatorio = numA - numB;
  return Math.max(0, somatorio)
}

if (saldoVitorias <= 0){
  rankAtual = "RankNegativo"
} else if (saldoVitorias <= 10){
  rankAtual = "Ferro"
} else if (saldoVitorias <=20){
  rankAtual = "Bronze"
}else if (saldoVitorias <=50){
  rankAtual = "Prata"
}else if (saldoVitorias <=80){
  rankAtual = "Ouro"
}else if (saldoVitorias <=90){
  rankAtual = "Diamante"
}else if (saldoVitorias <=100){
  rankAtual = "Lendário"
}else if (saldoVitorias >=101){
  rankAtual = "Imortal"
}

console.log(saldoVitorias);
console.log("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + rankAtual)