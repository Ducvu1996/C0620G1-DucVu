function checkForm(form)
{
    // regular expression to match required date format
    re = /^(\d{1,2})\/(\d{1,2})\/(\d{4})$/;

    if(form.startdate.value != '') {
        if(regs = form.startdate.value.match(re)) {
            if(regs[1] < 1 || regs[1] > 31) {
                alert("Invalid value for day: " + regs[1]);
                form.startdate.focus();
                return false;
            }
            if(regs[2] < 1 || regs[2] > 12) {
                alert("Invalid value for month: " + regs[2]);
                form.startdate.focus();
                return false;
            }
            if(regs[3] < 1902 || regs[3] > (new Date()).getFullYear()) {
                alert("Invalid value for year: " + regs[3] + " - must be between 1902 and " + (new Date()).getFullYear());
                form.startdate.focus();
                return false;
            }
        } else {
            alert("Invalid date format: " + form.startdate.value);
            form.startdate.focus();
            return false;
        }
    }

    if(form.enddate.value != '') {
        if(regs = form.enddate.value.match(re)) {
            if(regs[1] < 1 || regs[1] > 31) {
                alert("Invalid value for day: " + regs[1]);
                form.enddate.focus();
                return false;
            }
            if(regs[2] < 1 || regs[2] > 12) {
                alert("Invalid value for month: " + regs[2]);
                form.enddate.focus();
                return false;
            }
            if(regs[3] < 1902 || regs[3] > (new Date()).getFullYear()) {
                alert("Invalid value for year: " + regs[3] + " - must be between 1902 and " + (new Date()).getFullYear());
                form.enddate.focus();
                return false;
            }
        } else {
            alert("Invalid date format: " + form.enddate.value);
            form.enddate.focus();
            return false;
        }
    }

    // regular expression to match required time format
    re = /^(\d{1,2}):(\d{2})([ap]m)?$/;

    if(form.starttime.value != '') {
        if(regs = form.starttime.value.match(re)) {
            if(regs[3]) {
                if(regs[1] < 1 || regs[1] > 12) {
                    alert("Invalid value for hours: " + regs[1]);
                    form.starttime.focus();
                    return false;
                }
            } else {
                if(regs[1] > 23) {
                    alert("Invalid value for hours: " + regs[1]);
                    form.starttime.focus();
                    return false;
                }
            }
            if(regs[2] > 59) {
                alert("Invalid value for minutes: " + regs[2]);
                form.starttime.focus();
                return false;
            }
        } else {
            alert("Invalid time format: " + form.starttime.value);
            form.starttime.focus();
            return false;
        }
    }

    alert("All input fields have been validated!");
    return true;
}