function acesso() {
    var data = new Date()
    var dias = data.getDay()
    var mes = data.getMonth()
    var ano = data.getFullYear()
    var meses =  new Array('Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro')
    var diasSemana = new Array('Domingo', 'Segunda-feira', 'Terça-feira', 'Quarta-feira', 'Quinta-feira', 'Sexta-feira', 'Sábado')
    var hoje = data.getDate();
    var hora = data.getHours();
    var min = data.getMinutes();
    var sec = data.getSeconds();
    var strHora = hora + ":" + min + ":" + sec;
    var strData = diasSemana[dias] + ", " + hoje + " de " + meses[mes] + " de " + ano + " - " + strHora;
    document.write(strData);
}
