let sout, i, j;
sout = "<table border='1' width='300' cellspacing='0' cellpadding='3'>";
i = 1;
j=2;
while (i < 10) {
    sout = sout + "<tr>";
    while (j < 10) {
        sout = sout + "<td>" +j+'x'+i+'='+ i * j + "</td>";
        j++;
    }
    sout = sout + "</tr>";
    j = 2;
    i++;
}
sout = sout + "</table>";
document.write(sout);
