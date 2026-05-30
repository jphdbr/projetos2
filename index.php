<?php 
session_start();

if(!isset($_SESSION['nome'])){
    //header("Location: login.php");
    echo "nao tem sessao";
} else {
    echo "Bem-vindo, " . $_SESSION['nome'];
}