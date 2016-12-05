<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
  <title>Stage X - Contact</title>
  <meta charset="utf-8">
  <!--Import Google Icon Font-->
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

  <!--Let browser know website is optimized for mobile-->
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <link rel="stylesheet" href="css/master.css" media="screen" title="no title">
</head>
<body>

<%@ include file="commonContent/header.jsp" %>

  <div class="container">
    <main>
      <div class="row">
        <div class="col s6">
          <h4>Demande de convention</h4>
        </div>
      </div>
      <div class="row card-panel">
        <form class="col s12">
          <div class="row">
            <div class="input-field col s12">
              <i class="material-icons prefix">mode_edit</i>
              <textarea id="icon_prefix2" class="materialize-textarea"></textarea>
              <label for="icon_prefix2">Présentation succincte de l’Entreprise ou du Service</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <i class="material-icons prefix">mode_edit</i>
              <textarea id="icon_prefix2" class="materialize-textarea"></textarea>
              <label for="icon_prefix2">Contexte dans lequel s’intègre le stage</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <i class="material-icons prefix">mode_edit</i>
              <textarea id="icon_prefix2" class="materialize-textarea"></textarea>
              <label for="icon_prefix2">Mission confiée au stagiaire - Objectifs</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <i class="material-icons prefix">mode_edit</i>
              <textarea id="icon_prefix2" class="materialize-textarea"></textarea>
              <label for="icon_prefix2">Si possible, principales étapes du stage</label>
            </div>
          </div>
          <div class="row">
            <div class="input-field col s12">
              <i class="material-icons prefix">mode_edit</i>
              <textarea id="icon_prefix2" class="materialize-textarea"></textarea>
              <label for="icon_prefix2">Connaissances requises</label>
            </div>
          </div>
          <div class="row">
            <div class="col s3 offset-s5">
              <a class="waves-effect waves-light btn btn-isep" href=""><i class="material-icons left">email</i>Envoyer</a>
            </div>
          </div>
        </form>
      </div>
    </main>
  </div>

<%@ include file="commonContent/footer.jsp" %>

  <!--Import jQuery before materialize.js-->
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="js/materialize.min.js"></script>

  <script type="text/javascript">
  $('.button-collapse').sideNav({
    closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
    draggable: true // Choose whether you can drag to open on touch screens
  }
  );
  </script>
</body>
</html>
