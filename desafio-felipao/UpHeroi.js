// declaracao heroi

let nomeHeroi = "Doug"
let xpHeroi = 12000
let nivelHeroi = ""

if (xpHeroi <=1000){
    nivelHeroi = "Ferro"
}
if (xpHeroi > 1000 && xpHeroi <= 2000){
    nivelHeroi = "Bronze"
}
if (xpHeroi > 2000 && xpHeroi <= 5000){
    nivelHeroi = "Prata"
}
if (xpHeroi > 5000 && xpHeroi <= 7000){
    nivelHeroi = "Ouro"
}
if (xpHeroi > 7000 && xpHeroi <= 8000){
    nivelHeroi = "Platina"
}
if (xpHeroi > 8000 && xpHeroi <= 9000){
    nivelHeroi = "Ascendente"
}
if (xpHeroi > 9000 && xpHeroi <= 10000){
    nivelHeroi = "Imortal"
}
if (xpHeroi >= 10001){
    nivelHeroi = "Radiante"
}



console.log("O Herói de nome " + nomeHeroi + " está no nível de " + nivelHeroi)