<?php 
session_start();
require 'contato.class.php';

if(isset($_POST['nome']) && !empty($_POST['email']) && !empty($_POST['senha'])){
    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];
    $contato = new Contato();
    $conecta = $contato->conecta();

    if($conecta){
        $chkUser = $contato->checkUser($email);
        if($chkUser){
            $chkPass = $contato->checkPass($email, $senha);
            if($chkPass){
                $_SESSION['nome'] = $chkPass['nome'];
                header("Location: index.php");
                exit;
            } else {
                echo "login ou senha incorretos!";
            }
        } else {
            echo "login ou senha incorretos!";
        }
    } else {
        echo "Erro ao conectar ao banco de dados.";
    }
}
?>

<!DOCTYPE html>
<head>
    <script src="js/acesso.js"></script>
    <link rel="stylesheet" href="css/acesso.css">
    <title>Login 3</title>
</head>
<body>
<div class ="topo verde">
    <div class = "data verde borda">
     <script>
        acesso();
     </script>
    </div>
    <spam class = "fonte">logomarca
</div>
      <script>
      var data = new Date();  
      var dias = data.getDay();
      var mes = data.getMonth();
      var ano = data.getFullYear();
      var meses = new Array("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
      var diaSemana = new Array("Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado");
      var hoje = data.getDate();
      var hora = data.getHours();
      var min = data.getMinutes();
      var sec = data.getSeconds();
      var strHora = hora + ":" + min + ":" + sec;
      var strData = diaSemana[dias] + ", " + hoje + " de " + meses[mes] + " de " + ano + " - " + strHora;
        document.write(strData);
        </script>
    </div>
    <spam class = "fonte">logomarca 
</div>
 <div class="centraliza">
    <div class="formulario interna">
    <form class="form" method="post">
        nome: <br>
        <input type="text" name="nome" class="i1"><br><br>
        email: <br>
        <input type="email" name="email" class="i1"><br><br>
        senha: <br>
        <input type="password" name="senha" class="i1"><br><br>
        <p><a href="forgotpass.html" class="esqueceu">Esqueceu a senha?</a></p>
        <input type="submit"  name="botao" value="Entrar" class="btn">
    </form> 
    </div>   
 </div>
</body>
</html>