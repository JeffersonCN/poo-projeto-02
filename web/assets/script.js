$(document).ready(function (e) {
    $('.ui.form')
        .form({
            fields: {
                capital: ['number', 'empty'],
                taxa: ['number', 'empty'],
                periodos: ['integer', 'empty'],
            }
        });

    $('.card').hide().transition({
        debug: true,
        animation: 'fly left',
        duration: 1000,
        interval: 200
    });

     $('.swing-down').transition({
        debug: true,
        animation: 'swing down',
        duration: 1000,
        interval: 200
    });

    $('#resultados').transition({
        debug: true,
        animation: 'fade down',
        duration: 600,
        interval: 300
    });
});