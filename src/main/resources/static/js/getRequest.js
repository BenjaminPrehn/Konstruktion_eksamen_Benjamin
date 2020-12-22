$( document ).ready(function() {

    // Get Request for Data
    function ajaxGet(){
        $.ajax({
            type : "GET",
            url : "http://localhost:8080/api/students",
            success: function(result){

                $.each(result, function(i, students){
                    var studentid = students.studentId;
                    var studentfirstname = students.firstname;
                    var studentlastname = students.lastname;
                    var studentemail = students.email;
                    var studentsupervisor = students.supervisorId;

                    // Loading data into table
                    $('#studentTable')
                        .append($("<tr>"))
                        .append($("<td>").append(studentid))
                        .append($("<td>").append(studentfirstname))
                        .append($("<td>").append(studentlastname))
                        .append($("<td>").append(studentemail))
                        .append($("<td>").append(studentsupervisor))
                        .append($("<td>").append("<button id='delete'>delete</button><button id='update'>Update</button>"));
                });
            },

        });
    }

    // Deleting from RestController
    $('table').on('click', 'button[id="delete"]', function(e){
        var studentId = $(this).closest('tr').children('td:first').text();

        $.ajax({
            type:"DELETE",
            url:"http://localhost:8080/api/students/" + studentId,
            success: function(data){
            },
            error: function(err) {
                console.log(err);
                alert(err);
            }
        });

    })


    ajaxGet();
})


