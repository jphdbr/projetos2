<?php

class Contato{

    private $nome;
    private $email;
    private $senha;
    private $pdo = null;

    function conecta(){
        $dns = "mysql:dbname=contato;host=localhost";
        $UserName = "root";
        $UserPass = "";
        try{
           $this->pdo = new PDO($dns, $UserName, $UserPass);
           return true;
        } catch (\Throwable $th){
            return false;
        }
    }   
    public function inserir($nome, $email, $senha)
    {
     $sql = "INSERT INTO usuario SET nome = :n, email = :e, senha = :s";
     $stmt = $this->pdo->prepare($sql);
     $stmt->bindValue(":e", $email);
     $stmt->bindValue(":n", $nome);
     $stmt->bindValue(":s", $senha);
     return $stmt->execute();   
    }
    public function checkUser($email)
    {
     $sql = "SELECT * FROM usuario WHERE email = :e";
     $stmt = $this->pdo->prepare($sql);
     $stmt->bindValue(":e", $email);
     $stmt->execute();
     return $stmt->rowCount() > 0;
    }
    public function checkPass($email, $senha)
    {
    $sql = "SELECT * FROM usuario WHERE email = :e AND senha = :s";
    $stmt = $this->pdo->prepare($sql);
    $stmt->bindValue(":e", $email);
    $stmt->bindValue(":s", md5($senha));
    $stmt->execute();
    
    if ($stmt->rowCount() > 0) {
        return $stmt->fetch(PDO::FETCH_ASSOC);
    }
    return false;
    }
    public function listarUsuarios()
    {
        $sql = "SELECT * FROM usuario";
        $stmt = $this->pdo->prepare($sql);
        $stmt ->execute();
        if ($stmt->rowCount() > 0){
          return $stmt->fetchAll();  
        } else {
            return array();
        }
    }
    public function listarUsuario($id)
    {
     $sql = "SELECT * FROM usuario WHERE id = :i";
     $stmt = $this->pdo->prepare($sql);
     $stmt->bindValue(":i", $id);

    $stmt ->execute();
    if ($stmt->rowCount() > 0) {
        return $stmt->fetch();
    } else {
        return array ();
    }
    }
    public function apagqarUsuario($id){
        $sql = "DELETE FROM usuario WHERE id = :i";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":i", $id);
        return $stmt->execute();
    }
}
?>