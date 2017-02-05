<@tonado>
<div>
    <div class="navbar navbar-inverse navbar-fixed-top tonado-navbar-color" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/tonado/">Tonado</a>
            </div>
            <div class="navbar-collapse collapse">
                <form class="navbar-form navbar-right" role="form">
                    <button type="button" class="btn btn-default" data-toggle="modal" data-target="#registrationModule">Регистрация</button>
                    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#loginModule">Войти</button>
                </form>
            </div>
        </div>
    </div>
    <div class="jumbotron">
        <div class="container">
            <h1 style="padding-top: 40px">Добро пожаловать в Tonado!</h1>
            <p>Tonado поможет тебе хранить и управлять всеми задачами</p>
            <p><a class="btn btn-primary btn-lg" role="button">Узнать больше &raquo;</a></p>
        </div>
    </div>

    <div id="registrationModule" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Регистрация</h4>
                </div>
                <div class="modal-body">
                    <p>Some text in the modal.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button>
                </div>
            </div>
        </div>
    </div>
    <div id="loginModule" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Войти</h4>
                </div>
                <div class="modal-body">
                    <p>Some text in the modal.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-success" onclick="helloWorld()" data-dismiss="modal">Зарегистрироваться</button>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Отмена</button>
                </div>
            </div>
        </div>
    </div>
</div>
</@tonado>
