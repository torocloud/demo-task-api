var $taskManagementTable = $('#task-management-table');
var $taskManagementInformationView = $('#task-management-information-view');
var $taskManagementNewForm = $('#task-management-new-form');
var $taskManagementMenuToggler = $('#demo-top-bar-menu-toggle');
var $taskManagementSidebar = $('#demo-sidebar');
var $taskManagementSidebarClose = $('#demo-sidebar-close');

/*
* Modal Table variables
*/
var $entity;
var $currentSelected;

/*
* Project Modal Table variables
*/
var $projectModalTableApply = $('#projectModalTableApply');
var $projectModalTable = $('#projectModalTable');

/*
* User Modal Table variables
*/
var $userModalTableApply = $('#userModalTableApply');
var $userModalTable = $('#userModalTable');

/*
* Task Modal Table variables
*/
var $taskModalTableApply = $('#taskModalTableApply');
var $taskModalTable = $('#taskModalTable');

/*
* Project variables
*/

var $project = $('#project');
var $projectHeader = $('#project-header');
var $projectTable = $('#project-table');
var $projectTableContainer = $('#project-table-container');
var $projectInformationView = $('#project-information-view');
var $projectNew = $('#project-new');
var $projectNewForm = $('#project-new-form');
var $projectNewFormElement = $('#project-new-form-element');
var $projectNewFormSave = $('#project-new-form-save');
var $projectInfoViewForm = $('#project-information-view-form');
var $projectInfoUpdate = $('#project-info-update');
var $projectInfoDelete = $('#project-info-delete');
var $projectTaskTable = $('#project-task-table');

/*
* Task variables
*/

var $task = $('#task');
var $taskHeader = $('#task-header');
var $taskTable = $('#task-table');
var $taskTableContainer = $('#task-table-container');
var $taskInformationView = $('#task-information-view');
var $taskNew = $('#task-new');
var $taskNewForm = $('#task-new-form');
var $taskNewFormElement = $('#task-new-form-element');
var $taskNewFormSave = $('#task-new-form-save');
var $taskInfoViewForm = $('#task-information-view-form');
var $taskInfoUpdate = $('#task-info-update');
var $taskInfoDelete = $('#task-info-delete');
var $taskNoteTable = $('#task-note-table');
var $taskNoteTableToolbarAdd = $('#task-note-table-toolbar-add');
var $taskTimesheetTableToolbarAdd = $('#task-timesheet-table-toolbar-add');
var $taskTimesheetTable = $('#task-timesheet-table');

/*
* User variables
*/

var $user = $('#user');
var $userHeader = $('#user-header');
var $userTable = $('#user-table');
var $userTableContainer = $('#user-table-container');
var $userInformationView = $('#user-information-view');
var $userNew = $('#user-new');
var $userNewForm = $('#user-new-form');
var $userNewFormElement = $('#user-new-form-element');
var $userNewFormSave = $('#user-new-form-save');
var $userInfoViewForm = $('#user-information-view-form');
var $userInfoUpdate = $('#user-info-update');
var $userInfoDelete = $('#user-info-delete');

/*
* Note variables
*/

var $note = $('#note');
var $noteHeader = $('#note-header');
var $noteTable = $('#note-table');
var $noteTableContainer = $('#note-table-container');
var $noteInformationView = $('#note-information-view');
var $noteNew = $('#note-new');
var $noteNewForm = $('#note-new-form');
var $noteNewFormElement = $('#note-new-form-element');
var $noteNewFormSave = $('#note-new-form-save');
var $noteInfoViewForm = $('#note-information-view-form');
var $noteInfoUpdate = $('#note-info-update');
var $noteInfoDelete = $('#note-info-delete');

/*
* Timesheet variables
*/

var $timesheet = $('#timesheet');
var $timesheetHeader = $('#timesheet-header');
var $timesheetTable = $('#timesheet-table');
var $timesheetTableContainer = $('#timesheet-table-container');
var $timesheetInformationView = $('#timesheet-information-view');
var $timesheetNew = $('#timesheet-new');
var $timesheetNewForm = $('#timesheet-new-form');
var $timesheetNewFormElement = $('#timesheet-new-form-element');
var $timesheetNewFormSave = $('#timesheet-new-form-save');
var $timesheetInfoViewForm = $('#timesheet-information-view-form');
var $timesheetInfoUpdate = $('#timesheet-info-update');
var $timesheetInfoDelete = $('#timesheet-info-delete');

function preventKeyEvent(event) {
    event.preventDefault();
}

/*
* Notification function
*/

function notify(message, type) {
    $.notify({
        message: message
    },{
        type: type
    });
}

/*
* Tables date formatter function
*/

function dateFormat(value, row, index) {
    if(value === undefined) {
        return 'None'
    }
    return moment(value).format('MMM DD, yyyy');
}

/*
* Component toggle functions
*/

function initTable(entity) {

    if(entity === 'project') {
        $projectTable.bootstrapTable('destroy').bootstrapTable({
            columns: [
                {
                    title: 'ID',
                    field: 'projectId',
                    align: 'left'
                }, {
                    title: 'Project Name',
                    field: 'name',
                    align: 'left'
                }, {
                    title: 'Project Code',
                    field: 'code',
                    align: 'left'
                }, {
                    title: 'Status',
                    field: 'status',
                    align: 'left'
                }
            ],
            responseHandler: function (res) {
                res.rows = res.project;
                return res
            }
        });
    }

    if(entity === 'task') {
        $taskTable.bootstrapTable('destroy').bootstrapTable({
            columns: [
                {
                    title: 'ID',
                    field: 'taskId',
                    align: 'left'
                }, {
                    title: 'Subject',
                    field: 'subject',
                    align: 'left'
                }, {
                    title: 'Status',
                    field: 'status',
                    align: 'left'
                }, {
                    title: 'Deadline',
                    field: 'deadline',
                    align: 'left',
                    formatter: 'dateFormat'
                }
            ],
            ajax: function (params) {
                let assignedUserId = document.getElementById('task-table-assignedUserId').value
                let url = '/api/demo_api_tasks/1.0/task'
                    + '?limit=' + params.data.limit
                    + '&offset=' + params.data.offset
                    + '&search=' + params.data.search
                if(assignedUserId !== '') {
                    url = '/api/demo_api_tasks/1.0/task/user/' + assignedUserId
                        + '?limit=' + params.data.limit
                        + '&offset=' + params.data.offset
                }
                getAllData(url)
                    .then(data => {
                        params.success(data);
                    })
            },
            responseHandler: function (res) {
                res.rows = res.task;
                return res
            }
        });
    }

    if(entity === 'user') {
        $userTable.bootstrapTable('destroy').bootstrapTable({
            columns: [
                {
                    title: 'ID',
                    field: 'userId',
                    align: 'left'
                }, {
                    title: 'Email',
                    field: 'email',
                    align: 'left'
                }, {
                    title: 'First Name',
                    field: 'firstName',
                    align: 'left'
                }, {
                    title: 'Last Name',
                    field: 'lastName',
                    align: 'left'
                }
            ],
            responseHandler: function (res) {
                res.rows = res.user;
                return res
            }
        });
    }
}

function headerToggle(entity) {
    entity === 'project' ? $projectHeader.show() : $projectHeader.hide();
    entity === 'task' ? $taskHeader.show() : $taskHeader.hide();
    entity === 'user' ? $userHeader.show() : $userHeader.hide();
}

function tableToggle(entity) {
    entity === 'project' ? $projectTableContainer.show() : $projectTableContainer.hide();
    entity === 'task' ? $taskTableContainer.show() : $taskTableContainer.hide();
    entity === 'user' ? $userTableContainer.show() : $userTableContainer.hide();
}

function informationToggle(entity) {
    entity === 'project' ? $projectInformationView.show() : $projectInformationView.hide();
    entity === 'task' ? $taskInformationView.show() : $taskInformationView.hide();
    entity === 'user' ? $userInformationView.show() : $userInformationView.hide();
}

function newFormToggle(entity) {
    entity === 'project' ? $projectNewForm.show() : $projectNewForm.hide();
    entity === 'task' ? $taskNewForm.show() : $taskNewForm.hide();
    entity === 'user' ? $userNewForm.show() : $userNewForm.hide();
}

function componentToggle(part) {
    part === 'table' ? $taskManagementTable.show() : $taskManagementTable.hide();
    part === 'information' ? $taskManagementInformationView.show() : $taskManagementInformationView.hide();
    part === 'new' ? $taskManagementNewForm.show() : $taskManagementNewForm.hide()
}

/*
* Generic requests functions
*/

async function getAllData(url = '') {
    const response = await fetch(url, {
        method: 'GET',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'
        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer',
    });
    return response.json();
}

async function getData(url = '', id = '') {
    const response = await fetch(url + id, {
        method: 'GET',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'
        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer',
    });
    return response.json();
}

async function postData(url = '', data = {}) {
    const response = await fetch(url, {
        method: 'POST',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'
        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer',
        body: JSON.stringify(data)
    });
    return response.json();
}

async function putData(url = '', data = {}) {
    const response = await fetch(url, {
        method: 'PUT',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'
        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer',
        body: JSON.stringify(data)
    });
    return response.json();
}

async function deleteData(url = '', id = '') {
    const response = await fetch(url + id, {
        method: 'DELETE',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'
        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer'
    });
    return response.json();
}

/*
* Entity table click functions
*/

$project.click(function() {
    headerToggle('project');
    tableToggle('project');
    componentToggle('table');
    initTable('project');
    if($taskManagementSidebar.hasClass('demo-sidebar-toggle')) {
        $taskManagementSidebar.removeClass('demo-sidebar-toggle');
    }
});

$task.click(function() {
    headerToggle('task');
    tableToggle('task');
    componentToggle('table');
    initTable('task');
    if($taskManagementSidebar.hasClass('demo-sidebar-toggle')) {
        $taskManagementSidebar.removeClass('demo-sidebar-toggle');
    }
});

$user.click(function() {
    headerToggle('user');
    tableToggle('user');
    componentToggle('table');
    initTable('user');
    if($taskManagementSidebar.hasClass('demo-sidebar-toggle')) {
        $taskManagementSidebar.removeClass('demo-sidebar-toggle');
    }
});

/*
* Entity row click functions
*/
$projectTable.on("click-row.bs.table", function (e, row, $element, field) {
    componentToggle('information');
    informationToggle('project');

    $('#project-info-id')[0].value = row.projectId;
    $('#project-info-name')[0].value = row.name;
    $('#project-info-code')[0].value = row.code;
    $('#project-info-status')[0].value = row.status;
    $('#project-info-description')[0].value = row.description;
    $('#project-info-name-required-label').addClass('d-none');
    $('#project-info-code-required-label').addClass('d-none');

    if(row.deadLine !== undefined) {
        $('#project-info-deadline')[0].value = moment(row.deadLine).format("yyyy-MM-DD");
    } else {
        $('#project-info-deadline')[0].value = '';
    }

    $projectTaskTable.bootstrapTable('destroy').bootstrapTable({
        columns: [
            {
                title: 'ID',
                field: 'taskId',
                align: 'left'
            }, {
                title: 'Subject',
                field: 'subject',
                align: 'left'
            }, {
                title: 'Status',
                field: 'status',
                align: 'left'
            }, {
                title: 'Deadline',
                field: 'deadline',
                align: 'left',
                formatter: 'dateFormat'
            }
        ],
        ajax: function (params) {
            let assignedUserId = document.getElementById('project-task-table-assignedUserId').value
            let url = '/api/demo_api_tasks/1.0/task/project/' + row.code
            if(assignedUserId !== '') {
                url =  url + '/user/' + assignedUserId
            }
            url = url + '?limit=' + params.data.limit
                    + '&offset=' + params.data.offset
            getAllData(url)
                .then(data => {
                    params.success(data);
                })
        },
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$taskTable.on("click-row.bs.table", function (e, row, $element, field) {
    componentToggle('information');
    informationToggle('task');

    $('#task-info-id')[0].value = row.taskId;
    $('#task-info-subject')[0].value = row.subject;
    $('#task-info-status')[0].value = row.status;
    $('#task-info-description')[0].value = row.description;
    $('#task-info-projectId-required-label').addClass('d-none');
    $('#task-info-subject-required-label').addClass('d-none');

    if(row.deadline !== undefined) {
        $('#task-info-deadline')[0].value = moment(row.deadline).format("yyyy-MM-DD");
    } else {
        $('#task-info-deadline')[0].value = '';
    }
    
    if(row.projectId !== undefined) {
        getData('/api/demo_api_tasks/1.0/project/', row.projectId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#task-info-projectId')[0].value = data.project.projectId;
                    $('#task-info-projectId-display')[0].value = data.project.code;
                }
            });
    } else {
        $('#task-info-projectId')[0].value = '';
        $('#task-info-projectId-display')[0].value = '';
    }

    if(row.assignedUserId !== undefined) {
        getData('/api/demo_api_tasks/1.0/user/', row.assignedUserId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#task-info-assignedUserId')[0].value = data.user.userId;
                    $('#task-info-assignedUserId-display')[0].value = data.user.email;
                }
            });
    } else {
        $('#task-info-assignedUserId')[0].value = '';
        $('#task-info-assignedUserId-display')[0].value = '';
    }

    if(row.dependencyTask !== undefined) {
        getData('/api/demo_api_tasks/1.0/task/', row.dependencyTask)
            .then(data => {
                if(data.result === 'OK') {
                    $('#task-info-dependencyTask')[0].value = data.task.taskId;
                    $('#task-info-dependencyTask-display')[0].value = data.task.subject;
                }
            });
    } else {
        $('#task-info-dependencyTask')[0].value = '';
        $('#task-info-dependencyTask-display')[0].value = '';
    }

    $taskNoteTable.bootstrapTable('destroy').bootstrapTable({
        columns: [
            {
                title: 'ID',
                field: 'noteId',
                align: 'left'
            }, {
                title: 'Description',
                field: 'description',
                align: 'left'
            }
        ],
        ajax: function (params) {
            let url = '/api/demo_api_tasks/1.0/task/' + row.taskId + '/notes'
                + '?limit=' + params.data.limit
                + '&offset=' + params.data.offset
            getAllData(url)
                .then(data => {
                    params.success(data);
                })
        },
        responseHandler: function (res) {
            res.rows = res.note;
            return res
        }
    });

    $taskTimesheetTable.bootstrapTable('destroy').bootstrapTable({
        columns: [
            {
                title: 'ID',
                field: 'timesheetId',
                align: 'left'
            }, {
                title: 'Description',
                field: 'description',
                align: 'left'
            }, {
                title: 'Time Logged',
                field: 'timeLogged',
                align: 'left'
            }
        ],
        ajax: function (params) {
            let url = '/api/demo_api_tasks/1.0/task/' + row.taskId + '/timesheet'
                + '?limit=' + params.data.limit
                + '&offset=' + params.data.offset
            getAllData(url)
                .then(data => {
                    params.success(data);
                })
        },
        responseHandler: function (res) {
            res.rows = res.timesheet;
            return res
        }
    });
});

$userTable.on("click-row.bs.table", function (e, row, $element, field) {
    componentToggle('information');
    informationToggle('user');

    $('#user-info-id')[0].value = row.userId;
    $('#user-info-first-name')[0].value = row.firstName;
    $('#user-info-last-name')[0].value = row.lastName;
    $('#user-info-email')[0].value = row.email;
    $('#user-info-first-name-required-label').addClass('d-none');
    $('#user-info-last-name-required-label').addClass('d-none');
    $('#user-info-email-required-label').addClass('d-none');
});

$projectTaskTable.on("click-row.bs.table", function (e, row, $element, field) {
    componentToggle('information');
    informationToggle('task');
    headerToggle('task');

    $('#task-info-id')[0].value = row.taskId;
    $('#task-info-subject')[0].value = row.subject;
    $('#task-info-status')[0].value = row.status;
    $('#task-info-description')[0].value = row.description;
    $('#task-info-projectId-required-label').addClass('d-none');
    $('#task-info-subject-required-label').addClass('d-none');

    if(row.deadLine) {
        $('#task-info-deadline')[0].value = moment(row.deadLine).format("yyyy-MM-DD");
    }
    
    if(row.projectId !== undefined) {
        getData('/api/demo_api_tasks/1.0/project/', row.projectId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#task-info-projectId')[0].value = data.project.projectId;
                    $('#task-info-projectId-display')[0].value = data.project.code;
                }
            });
    }

    if(row.assignedUserId !== undefined) {
        getData('/api/demo_api_tasks/1.0/user/', row.assignedUserId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#task-info-assignedUserId')[0].value = data.user.userId;
                    $('#task-info-assignedUserId-display')[0].value = data.user.email;
                }
            });
    }

    if(row.dependencyTask !== undefined) {
        getData('/api/demo_api_tasks/1.0/task/', row.dependencyTask)
            .then(data => {
                if(data.result === 'OK') {
                    $('#task-info-dependencyTask')[0].value = data.task.taskId;
                    $('#task-info-dependencyTask-display')[0].value = data.task.subject;
                }
            });
    }
});

$taskNoteTable.on("click-row.bs.table", function (e, row, $element, field) {
    $('#noteInfoModal').modal('show');

    $('#note-info-id')[0].value = row.noteId;
    $('#note-info-description')[0].value = row.description;
    $('#note-info-description-required-label').addClass('d-none');

    if(row.userId !== undefined) {
        getData('/api/demo_api_tasks/1.0/user/', row.userId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#note-info-userId')[0].value = data.user.userId;
                    $('#note-info-userId-display')[0].value = data.user.email;
                }
            });
    }

    if(row.taskId !== undefined) {
        getData('/api/demo_api_tasks/1.0/task/', row.taskId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#note-info-taskId')[0].value = data.task.taskId;
                    $('#note-info-taskId-display')[0].value = data.task.subject;
                }
            });
    }
});

$taskTimesheetTable.on("click-row.bs.table", function (e, row, $element, field) {
    $('#timeshetInfoModal').modal('show');

    $('#timesheet-info-id')[0].value = row.timesheetId;
    $('#timesheet-info-description')[0].value = row.description;
    $('#timesheet-info-timeLogged')[0].value = row.timeLogged;
    $('#timesheet-info-description-required-label').addClass('d-none');
    $('#timesheet-info-timeLogged-required-label').addClass('d-none');

    if(row.userId !== undefined) {
        getData('/api/demo_api_tasks/1.0/user/', row.userId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#timesheet-info-userId')[0].value = data.user.userId;
                    $('#timesheet-info-userId-display')[0].value = data.user.email;
                }
            });
    }

    if(row.taskId !== undefined) {
        getData('/api/demo_api_tasks/1.0/task/', row.taskId)
            .then(data => {
                if(data.result === 'OK') {
                    $('#timesheet-info-taskId')[0].value = data.task.taskId;
                    $('#timesheet-info-taskId-display')[0].value = data.task.subject;
                }
            });
    }
});

/*
* Entity create click functions
*/

$projectNew.click(function() {
    componentToggle('new');
    newFormToggle('project');
    $('#project-new-name')[0].value = '';
    $('#project-new-code')[0].value = '';
    $('#project-new-status')[0].value = 'Not Started';
    $('#project-new-description')[0].value = '';
    $('#project-new-deadline')[0].value = '';
    $('#project-new-name-required-label').addClass('d-none');
    $('#project-new-code-required-label').addClass('d-none');
});

$taskNew.click(function() {
    componentToggle('new');
    newFormToggle('task');
    $('#task-new-subject')[0].value = '';
    $('#task-new-status')[0].value = 'Not Started';
    $('#task-new-description')[0].value = '';
    $('#task-new-deadline')[0].value = '';
    $('#task-new-projectId')[0].value = '';
    $('#task-new-projectId-display')[0].value = '';
    $('#task-new-assignedUserId')[0].value = '';
    $('#task-new-assignedUserId-display')[0].value = '';
    $('#task-new-dependencyTask')[0].value = '';
    $('#task-new-dependencyTask-display')[0].value = '';
    $('#task-new-subject-required-label').addClass('d-none');
    $('#task-new-projectId-required-label').addClass('d-none');
});

$userNew.click(function() {
    componentToggle('new');
    newFormToggle('user');
    $('#user-new-first-name')[0].value = '';
    $('#user-new-last-name')[0].value = '';
    $('#user-new-email')[0].value = '';
    $('#user-new-first-name-required-label').addClass('d-none');
    $('#user-new-last-name-required-label').addClass('d-none');
    $('#user-new-email-required-label').addClass('d-none');
});

$taskNoteTableToolbarAdd.click(function() {
    $('#addNoteModel').modal('show');
    $('#note-new-description')[0].value = '';
    $('#note-new-taskId')[0].value = document.getElementById('task-info-id').value;
    $('#note-new-taskId-display')[0].value = document.getElementById('task-info-subject').value;
    $('#note-new-description-required-label').addClass('d-none');
});

$taskTimesheetTableToolbarAdd.click(function() {
    $('#addLogTimeModel').modal('show');
    $('#timesheet-new-description')[0].value = '';
    $('#timesheet-new-timeLogged')[0].value = 0;
    $('#timesheet-new-taskId')[0].value = document.getElementById('task-info-id').value;
    $('#timesheet-new-taskId-display')[0].value = document.getElementById('task-info-subject').value;
    $('#timesheet-new-description-required-label').addClass('d-none');
    $('#timesheet-new-timeLogged-required-label').addClass('d-none');
});

/*
* Entity create functions
*/

$projectNewFormSave.click(function() {
    if( $projectNewFormElement[0].checkValidity() ) {

        let projectData = {
            name: document.getElementById('project-new-name').value,
            code: document.getElementById('project-new-code').value,
            status: document.getElementById('project-new-status').value,
            description: document.getElementById('project-new-description').value,
            deadLine: document.getElementById('project-new-deadline').value,
        }

        if(projectData.deadLine === '') {
            projectData.deadLine = undefined;
        }

        postData('/api/demo_api_tasks/1.0/project', projectData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    headerToggle('project');
                    tableToggle('project');
                    componentToggle('table');
                    initTable('project');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $projectNewFormElement[0].reportValidity();

        let projectData = {
            name: document.getElementById('project-new-name').value,
            code: document.getElementById('project-new-code').value,
        }
        projectData.name === '' ? $('#project-new-name-required-label').removeClass('d-none') : $('#project-new-name-required-label').addClass('d-none');
        projectData.code === '' ? $('#project-new-code-required-label').removeClass('d-none') : $('#project-new-code-required-label').addClass('d-none');
    }
});

$taskNewFormSave.click(function() {
    if( $taskNewFormElement[0].checkValidity() ) {

        let taskData = {
            subject: document.getElementById('task-new-subject').value,
            status: document.getElementById('task-new-status').value,
            description: document.getElementById('task-new-description').value,
            deadline: document.getElementById('task-new-deadline').value,
            projectId: document.getElementById('task-new-projectId').value,
            assignedUserId: document.getElementById('task-new-assignedUserId').value,
            dependencyTask: document.getElementById('task-new-dependencyTask').value,
        }

        if(taskData.deadline === '') {
            taskData.deadline = undefined;
        }

        if(taskData.projectId === '') {
            taskData.projectId = undefined;
            $('#task-new-projectId-required-label').removeClass('d-none');
            notify('Project is required', 'danger');
            return undefined;
        }

        if(taskData.assignedUserId === '') {
            taskData.assignedUserId = undefined;
        }

        if(taskData.dependencyTask === '') {
            taskData.dependencyTask = undefined;
        }

        postData('/api/demo_api_tasks/1.0/task', taskData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    headerToggle('task');
                    tableToggle('task');
                    componentToggle('table');
                    initTable('task');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $taskNewFormElement[0].reportValidity();

        let taskData = {
            subject: document.getElementById('task-new-subject').value
        }
        taskData.subject === '' ? $('#task-new-subject-required-label').removeClass('d-none') : $('#task-new-subject-required-label').addClass('d-none');
    }
});

$userNewFormSave.click(function() {
    if( $userNewFormElement[0].checkValidity() ) {

        let userData = {
            firstName: document.getElementById('user-new-first-name').value,
            lastName: document.getElementById('user-new-last-name').value,
            email: document.getElementById('user-new-email').value
        }

        postData('/api/demo_api_tasks/1.0/user', userData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    headerToggle('user');
                    tableToggle('user');
                    componentToggle('table');
                    initTable('user');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $userNewFormElement[0].reportValidity();

        let userData = {
            firstName: document.getElementById('user-new-first-name').value,
            lastName: document.getElementById('user-new-last-name').value,
            email: document.getElementById('user-new-email').value
        }
        userData.firstName === '' ? $('#user-new-first-name-required-label').removeClass('d-none') : $('#user-new-first-name-required-label').addClass('d-none');
        userData.lastName === '' ? $('#user-new-last-name-required-label').removeClass('d-none') : $('#user-new-last-name-required-label').addClass('d-none');
        userData.email === '' ? $('#user-new-email-required-label').removeClass('d-none') : $('#user-new-email-required-label').addClass('d-none');
    }
});

$noteNewFormSave.click(function() {
    if( $noteNewFormElement[0].checkValidity() ) {

        let noteData = {
            description: document.getElementById('note-new-description').value,
            taskId: document.getElementById('note-new-taskId').value,
            userId: document.getElementById('note-new-userId').value,
        }

        if(noteData.taskId === '') {
            noteData.taskId = undefined;
        }

        if(noteData.userId === '') {
            noteData.userId = undefined;
        }

        postData('/api/demo_api_tasks/1.0/note', noteData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    $('#addNoteModel').modal('hide');
                    $taskNoteTable.bootstrapTable('refresh');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $noteNewFormElement[0].reportValidity();

        let noteData = {
            description: document.getElementById('note-new-description').value
        }
        noteData.description === '' ? $('#note-new-description-required-label').removeClass('d-none') : $('#note-new-description-required-label').addClass('d-none');
    }
});

$timesheetNewFormSave.click(function() {
    if( $timesheetNewFormElement[0].checkValidity() ) {

        let timesheetData = {
            description: document.getElementById('timesheet-new-description').value,
            timeLogged: document.getElementById('timesheet-new-timeLogged').value,
            taskId: document.getElementById('timesheet-new-taskId').value,
            userId: document.getElementById('timesheet-new-userId').value,
        }

        if(timesheetData.taskId === '') {
            timesheetData.taskId = undefined;
        }

        if(timesheetData.userId === '') {
            timesheetData.userId = undefined;
        }

        postData('/api/demo_api_tasks/1.0/timesheet', timesheetData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    $('#addLogTimeModel').modal('hide');
                    $taskTimesheetTable.bootstrapTable('refresh');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $timesheetNewFormElement[0].reportValidity();

        let timesheetData = {
            description: document.getElementById('timesheet-new-description').value,
            timeLogged: document.getElementById('timesheet-new-timeLogged').value
        }
        timesheetData.description === '' ? $('#timesheet-new-description-required-label').removeClass('d-none') : $('#timesheet-new-description-required-label').addClass('d-none');
        timesheetData.timeLogged === '' ? $('#timesheet-new-timeLogged-required-label').removeClass('d-none') : $('#timesheet-new-timeLogged-required-label').addClass('d-none');
    }
});

/*
* Entity update functions
*/

$projectInfoUpdate.click(function () {
    if( $projectInfoViewForm[0].checkValidity() ) {

        let projectData = {
            projectId: document.getElementById('project-info-id').value,
            name: document.getElementById('project-info-name').value,
            code: document.getElementById('project-info-code').value,
            status: document.getElementById('project-info-status').value,
            description: document.getElementById('project-info-description').value,
            deadLine: document.getElementById('project-info-deadline').value,
        }

        if(projectData.deadLine === '') {
            projectData.deadLine = undefined;
        }

        putData('/api/demo_api_tasks/1.0/project', projectData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    headerToggle('project');
                    tableToggle('project');
                    componentToggle('table');
                    initTable('project');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $projectInfoViewForm[0].reportValidity();
        let projectData = {
            projectId: document.getElementById('project-info-id').value,
            name: document.getElementById('project-info-name').value,
            code: document.getElementById('project-info-code').value,
            status: document.getElementById('project-info-status').value,
            description: document.getElementById('project-info-description').value,
            deadLine: document.getElementById('project-info-deadline').value,
        }
        projectData.name === '' ? $('#project-info-name-required-label').removeClass('d-none') : $('#project-info-name-required-label').addClass('d-none');
        projectData.code === '' ? $('#project-info-code-required-label').removeClass('d-none') : $('#project-info-code-required-label').addClass('d-none');
    }
});

$taskInfoUpdate.click(function () {
    if( $taskInfoViewForm[0].checkValidity() ) {

        let taskData = {
            taskId: document.getElementById('task-info-id').value,
            subject: document.getElementById('task-info-subject').value,
            status: document.getElementById('task-info-status').value,
            description: document.getElementById('task-info-description').value,
            deadline: document.getElementById('task-info-deadline').value,
            projectId: document.getElementById('task-info-projectId').value,
            assignedUserId: document.getElementById('task-info-assignedUserId').value,
            dependencyTask: document.getElementById('task-info-dependencyTask').value,
        }

        if(taskData.deadline === '') {
            taskData.deadline = undefined;
        }

        if(taskData.projectId === '') {
            taskData.projectId = undefined;
            notify('Project is required', 'danger');
            $('#task-info-projectId-required-label').removeClass('d-none');
            return undefined;
        }

        if(taskData.assignedUserId === '') {
            taskData.assignedUserId = undefined;
        }

        if(taskData.dependencyTask === '') {
            taskData.dependencyTask = undefined;
        }

        putData('/api/demo_api_tasks/1.0/task', taskData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    headerToggle('task');
                    tableToggle('task');
                    componentToggle('table');
                    initTable('task');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $taskInfoViewForm[0].reportValidity();

        let taskData = {
            subject: document.getElementById('task-info-subject').value,
        }

        taskData.subject === '' ? $('#task-info-subject-required-label').removeClass('d-none') : $('#task-info-subject-required-label').addClass('d-none');
    }
});

$userInfoUpdate.click(function () {
    if( $userInfoViewForm[0].checkValidity() ) {

        let userData = {
            userId: document.getElementById('user-info-id').value,
            firstName: document.getElementById('user-info-first-name').value,
            lastName: document.getElementById('user-info-last-name').value,
            email: document.getElementById('user-info-email').value
        }

        putData('/api/demo_api_tasks/1.0/user', userData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    headerToggle('user');
                    tableToggle('user');
                    componentToggle('table');
                    initTable('user');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $userInfoViewForm[0].reportValidity();

        let userData = {
            firstName: document.getElementById('user-info-first-name').value,
            lastName: document.getElementById('user-info-last-name').value,
            email: document.getElementById('user-info-email').value
        }

        userData.firstName === '' ? $('#user-info-first-name-required-label').removeClass('d-none') : $('#user-info-first-name-required-label').addClass('d-none');
        userData.lastName === '' ? $('#user-info-last-name-required-label').removeClass('d-none') : $('#user-info-last-name-required-label').addClass('d-none');
        userData.email === '' ? $('#user-info-email-required-label').removeClass('d-none') : $('#user-info-email-required-label').addClass('d-none');
    }
});

$noteInfoUpdate.click(function () {
    if( $noteInfoViewForm[0].checkValidity() ) {

        let noteData = {
            noteId: document.getElementById('note-info-id').value,
            description: document.getElementById('note-info-description').value,
            taskId: document.getElementById('note-info-taskId').value,
            userId: document.getElementById('note-info-userId').value,
        }

        if(noteData.taskId === '') {
            noteData.taskId = undefined;
        }

        if(noteData.userId === '') {
            noteData.userId = undefined;
        }

        putData('/api/demo_api_tasks/1.0/note', noteData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    $('#noteInfoModal').modal('hide');
                    $taskNoteTable.bootstrapTable('refresh');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $noteInfoViewForm[0].reportValidity();
        let noteData = {
            description: document.getElementById('note-info-description').value
        }
        noteData.description === '' ? $('#note-info-description-required-label').removeClass('d-none') : $('#note-info-description-required-label').addClass('d-none');
    }
});

$timesheetInfoUpdate.click(function () {
    if( $timesheetInfoViewForm[0].checkValidity() ) {

        let timesheetData = {
            timesheetId: document.getElementById('timesheet-info-id').value,
            description: document.getElementById('timesheet-info-description').value,
            timeLogged: document.getElementById('timesheet-info-timeLogged').value,
            taskId: document.getElementById('timesheet-info-taskId').value,
            userId: document.getElementById('timesheet-info-userId').value,
        }

        if(timesheetData.taskId === '') {
            timesheetData.taskId = undefined;
        }

        if(timesheetData.userId === '') {
            timesheetData.userId = undefined;
        }

        putData('/api/demo_api_tasks/1.0/timesheet', timesheetData)
            .then(data => {
                if(data.result === 'OK') {
                    notify(data.message, 'success');
                    $('#timeshetInfoModal').modal('hide');
                    $taskTimesheetTable.bootstrapTable('refresh');
                } else {
                    notify(data.message, 'danger');
                }
            });

    } else {
        $timesheetInfoViewForm[0].reportValidity();
        let timesheetData = {
            description: document.getElementById('timesheet-info-description').value,
            timeLogged: document.getElementById('timesheet-info-timeLogged').value
        }
        timesheetData.description === '' ? $('#timesheet-info-description-required-label').removeClass('d-none') : $('#timesheet-info-description-required-label').addClass('d-none');
        timesheetData.timeLogged === '' ? $('#timesheet-info-timeLogged-required-label').removeClass('d-none') : $('#timesheet-info-timeLogged-required-label').addClass('d-none');
    }
});

$projectInfoDelete.click(function () {
    const projectId = document.getElementById('project-info-id').value;

    deleteData('/api/demo_api_tasks/1.0/project/', projectId)
        .then(data => {
            if(data.result === 'OK') {
                notify(data.message, 'success');
                headerToggle('project');
                tableToggle('project');
                componentToggle('table');
                initTable('project');
            } else {
                notify(data.message, 'danger');
            }
        });
});

$taskInfoDelete.click(function () {
    const taskId = document.getElementById('task-info-id').value;

    deleteData('/api/demo_api_tasks/1.0/task/', taskId)
        .then(data => {
            if(data.result === 'OK') {
                notify(data.message, 'success');
                headerToggle('task');
                tableToggle('task');
                componentToggle('table');
                initTable('task');
            } else {
                notify(data.message, 'danger');
            }
        });
});

$userInfoDelete.click(function () {
    const userId = document.getElementById('user-info-id').value;

    deleteData('/api/demo_api_tasks/1.0/user/', userId)
        .then(data => {
            if(data.result === 'OK') {
                notify(data.message, 'success');
                headerToggle('user');
                tableToggle('user');
                componentToggle('table');
                initTable('user');
            } else {
                notify(data.message, 'danger');
            }
        });
});

$noteInfoDelete.click(function () {
    const noteId = document.getElementById('note-info-id').value;

    deleteData('/api/demo_api_tasks/1.0/note/', noteId)
        .then(data => {
            if(data.result === 'OK') {
                notify(data.message, 'success');
                $('#noteInfoModal').modal('hide');
                $taskNoteTable.bootstrapTable('refresh');
            } else {
                notify(data.message, 'danger');
            }
        });
});

$timesheetInfoDelete.click(function () {
    const timesheetId = document.getElementById('timesheet-info-id').value;

    deleteData('/api/demo_api_tasks/1.0/timesheet/', timesheetId)
        .then(data => {
            if(data.result === 'OK') {
                notify(data.message, 'success');
                $('#timeshetInfoModal').modal('hide');
                $taskTimesheetTable.bootstrapTable('refresh');
            } else {
                notify(data.message, 'danger');
            }
        });
});



$('#task-new-projectId-manage').click(function () {
    $('#projectTableModel').modal('show');
    $entity = 'task-new';
    $projectModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Project Code',
                field: 'code',
                align: 'center'
            }, {
                title: 'Name',
                field: 'name',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.project;
            return res
        }
    });
});

$('#task-new-assignedUserId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'task-new';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#task-new-dependencyTask-manage').click(function () {
    $('#taskTableModel').modal('show');
    $entity = 'task-new';
    $taskModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Subject',
                field: 'subject',
                align: 'center'
            }, {
                title: 'Status',
                field: 'status',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$('#task-info-projectId-manage').click(function () {
    $('#projectTableModel').modal('show');
    $entity = 'task-info';
    $projectModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Project Code',
                field: 'code',
                align: 'center'
            }, {
                title: 'Name',
                field: 'name',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.project;
            return res
        }
    });
});

$('#task-info-assignedUserId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'task-info';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#task-info-dependencyTask-manage').click(function () {
    $('#taskTableModel').modal('show');
    $entity = 'task-info';
    $taskModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Subject',
                field: 'subject',
                align: 'center'
            }, {
                title: 'Status',
                field: 'status',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$('#note-new-taskId-manage').click(function () {
    $('#taskTableModel').modal('show');
    $entity = 'note-new';
    $taskModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Subject',
                field: 'subject',
                align: 'center'
            }, {
                title: 'Status',
                field: 'status',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$('#note-new-userId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'note-new';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#note-info-taskId-manage').click(function () {
    $('#taskTableModel').modal('show');
    $entity = 'note-info';
    $taskModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Subject',
                field: 'subject',
                align: 'center'
            }, {
                title: 'Status',
                field: 'status',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$('#note-info-userId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'note-info';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#timesheet-new-taskId-manage').click(function () {
    $('#taskTableModel').modal('show');
    $entity = 'timesheet-new';
    $taskModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Subject',
                field: 'subject',
                align: 'center'
            }, {
                title: 'Status',
                field: 'status',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$('#timesheet-new-userId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'timesheet-new';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#timesheet-info-taskId-manage').click(function () {
    $('#taskTableModel').modal('show');
    $entity = 'timesheet-info';
    $taskModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'Subject',
                field: 'subject',
                align: 'center'
            }, {
                title: 'Status',
                field: 'status',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.task;
            return res
        }
    });
});

$('#timesheet-info-userId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'timesheet-info';
    $priceListModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#task-table-assignedUserId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'task-table-filter';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

$('#project-task-table-assignedUserId-manage').click(function () {
    $('#userTableModel').modal('show');
    $entity = 'project-task-table-filter';
    $userModalTable.bootstrapTable('destroy').bootstrapTable({
        pageSize: 5,
        pageList: [5, 10],
        columns: [
            {
                title: 'First Name',
                field: 'firstName',
                align: 'center'
            }, 
            {
                title: 'Last Name',
                field: 'lastName',
                align: 'center'
            }
        ],
        responseHandler: function (res) {
            res.rows = res.user;
            return res
        }
    });
});

/*
* Modal Tables click function
*/

$projectModalTable.on('click-row.bs.table', function (e, row, $element, field) {
    if($element.hasClass('demo-highlight')) {
        $element.removeClass('demo-highlight');
        $projectModalTableApply.attr('disabled', true);
        $currentSelected = undefined;
    } else {
        $element.addClass('demo-highlight').siblings().removeClass('demo-highlight');
        $projectModalTableApply.removeAttr('disabled');
        $currentSelected = row;
    }
});

$userModalTable.on('click-row.bs.table', function (e, row, $element, field) {
    if($element.hasClass('demo-highlight')) {
        $element.removeClass('demo-highlight');
        $userModalTableApply.attr('disabled', true);
        $currentSelected = undefined;
    } else {
        $element.addClass('demo-highlight').siblings().removeClass('demo-highlight');
        $userModalTableApply.removeAttr('disabled');
        $currentSelected = row;
    }
});

$taskModalTable.on('click-row.bs.table', function (e, row, $element, field) {
    if($element.hasClass('demo-highlight')) {
        $element.removeClass('demo-highlight');
        $taskModalTableApply.attr('disabled', true);
        $currentSelected = undefined;
    } else {
        $element.addClass('demo-highlight').siblings().removeClass('demo-highlight');
        $taskModalTableApply.removeAttr('disabled');
        $currentSelected = row;
    }
});

/*
* Modal Tables apply function
*/

$projectModalTableApply.click(function () {
    if($entity === 'task-new') {
        $('#task-new-projectId').val($currentSelected.projectId);
        $('#task-new-projectId-display').val($currentSelected.code);
    }
    if($entity === 'task-info') {
        $('#task-info-projectId').val($currentSelected.projectId);
        $('#task-info-projectId-display').val($currentSelected.code);
    }
    $('#projectTableModel').modal('hide');
});

$userModalTableApply.click(function () {
    if($entity === 'task-new') {
        $('#task-new-assignedUserId').val($currentSelected.userId);
        $('#task-new-assignedUserId-display').val($currentSelected.email);
    }
    if($entity === 'task-info') {
        $('#task-info-assignedUserId').val($currentSelected.userId);
        $('#task-info-assignedUserId-display').val($currentSelected.email);
    }
    if($entity === 'note-new') {
        $('#note-new-userId').val($currentSelected.userId);
        $('#note-new-userId-display').val($currentSelected.email);
    }
    if($entity === 'note-info') {
        $('#note-info-userId').val($currentSelected.userId);
        $('#note-info-userId-display').val($currentSelected.email);
    }
    if($entity === 'timesheet-new') {
        $('#timesheet-new-userId').val($currentSelected.userId);
        $('#timesheet-new-userId-display').val($currentSelected.email);
    }
    if($entity === 'timesheet-info') {
        $('#timesheet-info-userId').val($currentSelected.userId);
        $('#timesheet-info-userId-display').val($currentSelected.email);
    }
    if($entity === 'task-table-filter') {
        $('#task-table-assignedUserId').val($currentSelected.userId);
        $('#task-table-assignedUserId-display').val($currentSelected.firstName + ' ' + $currentSelected.lastName);
        $('#task-table-remove-filter').removeClass('d-none');
        $taskTable.bootstrapTable('refresh');
    }
    if($entity === 'project-task-table-filter') {
        $('#project-task-table-assignedUserId').val($currentSelected.userId);
        $('#project-task-table-assignedUserId-display').val($currentSelected.firstName + ' ' + $currentSelected.lastName);
        $('#project-task-table-remove-filter').removeClass('d-none');
        $projectTaskTable.bootstrapTable('refresh');
    }
    $('#userTableModel').modal('hide');
});

$taskModalTableApply.click(function () {
    if($entity === 'task-new') {
        $('#task-new-dependencyTask').val($currentSelected.taskId);
        $('#task-new-dependencyTask-display').val($currentSelected.subject);
    }
    if($entity === 'task-info') {
        $('#task-info-dependencyTask').val($currentSelected.taskId);
        $('#task-info-dependencyTask-display').val($currentSelected.subject);
    }
    if($entity === 'note-new') {
        $('#note-new-taskId').val($currentSelected.taskId);
        $('#note-new-taskId-display').val($currentSelected.subject);
    }
    if($entity === 'note-info') {
        $('#note-info-taskId').val($currentSelected.taskId);
        $('#note-info-taskId-display').val($currentSelected.subject);
    }
    if($entity === 'timesheet-new') {
        $('#timesheet-new-taskId').val($currentSelected.taskId);
        $('#timesheet-new-taskId-display').val($currentSelected.subject);
    }
    if($entity === 'timesheet-info') {
        $('#timesheet-info-taskId').val($currentSelected.taskId);
        $('#timesheet-info-taskId-display').val($currentSelected.subject);
    }
    $('#taskTableModel').modal('hide');
});

$('#task-table-remove-filter').click(function () {
    $('#task-table-assignedUserId').val('');
    $('#task-table-assignedUserId-display').val('');
    $('#task-table-remove-filter').addClass('d-none');
    $taskTable.bootstrapTable('refresh');
});

$('#project-task-table-remove-filter').click(function () {
    $('#project-task-table-assignedUserId').val('');
    $('#project-task-table-assignedUserId-display').val('');
    $('#project-task-table-remove-filter').addClass('d-none');
    $projectTaskTable.bootstrapTable('refresh');
});

$taskManagementMenuToggler.click(function() {
    $taskManagementSidebar.addClass('demo-sidebar-toggle');
});

$taskManagementSidebarClose.click(function() {
    $taskManagementSidebar.removeClass('demo-sidebar-toggle');
});

/*
* Initialize function on load
*/
$(function() {
    headerToggle('project');
    tableToggle('project');
    componentToggle('table');
    initTable('project');
});