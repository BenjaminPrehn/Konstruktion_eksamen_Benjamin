$( document ).ready(function() {

    // DO GET
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : "http://localhost:8080/api/students",
            success: function(result){

                $.each(result, function(i, students){
                    var studentsfirstname = students.firstname;
                    var studentlastname = students.lastname;
                    var studentemail = students.email;
                    var studentsupervisor = students.supervisorId;

                    $('#studentTable')
                        .append($("<td>").append(studentsfirstname))
                        .append($("<td>").append(studentlastname))
                        .append($("<td>").append(studentemail))
                        .append($("<td>").append(studentsupervisor))
                        .append($("<tr>"));
                });
            },

        });
    }
    ajaxGet();
})


