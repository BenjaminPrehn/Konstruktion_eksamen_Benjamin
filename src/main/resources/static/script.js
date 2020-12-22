$.getJSON('http://localhost:8080/api/students"', function(data){
    /* console.log(data); */
    $(data).each(function(i, hero){
        $('#heroesBody').append($("<tr>")
            .append($("<td>").append(hero.name))
            .append($("<td>").append(hero.superheroName))
            .append($("<td>").append(hero.city)));
    });
})
    .done(function(){
        alert("Completed");
    })
    .fail(function(e){
        console.log('error:');
        console.error(e);
    })
    .always(function(){
        alert("always runs");
    });