{
    "type": "template",
    "paths": [
        "/demo/tasks"
    ],
    "methods": [
        "GET"
    ],
    "steps": [
        {
            "type": "invokeTemplate",
            "templateName": "demo_api_tasks.webpage_templates.IndexHead"
        },
        {
            "type": "containerTag",
            "children": [
                {
                    "type": "containerTag",
                    "children": [
                        {
                            "type": "containerTag",
                            "children": [
                                {
                                    "type": "containerTag",
                                    "children": [
                                        {
                                            "type": "containerTag",
                                            "tagName": "i",
                                            "attributes": {
                                                "class": "fas fa-bars"
                                            },
                                            "content": ""
                                        }
                                    ],
                                    "tagName": "button",
                                    "attributes": {
                                        "id": "demo-top-bar-menu-toggle",
                                        "type": "button",
                                        "class": "btn btn-primary"
                                    },
                                    "content": "Menu"
                                }
                            ],
                            "tagName": "div",
                            "attributes": {
                                "class": "demo-top-bar"
                            },
                            "content": ""
                        },
                        {
                            "type": "containerTag",
                            "children": [
                                {
                                    "type": "containerTag",
                                    "children": [
                                        {
                                            "type": "containerTag",
                                            "tagName": "h4",
                                            "attributes": {
                                                "class": "ml-3"
                                            },
                                            "content": "Task Management"
                                        },
                                        {
                                            "type": "containerTag",
                                            "tagName": "i",
                                            "attributes": {
                                                "id": "demo-sidebar-close",
                                                "class": "fas fa-times demo-sidebar-close"
                                            },
                                            "content": ""
                                        }
                                    ],
                                    "tagName": "div",
                                    "attributes": {
                                        "class": "demo-sidebar-logo d-flex align-items-center justify-content-between"
                                    },
                                    "content": ""
                                },
                                {
                                    "type": "containerTag",
                                    "children": [
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "a",
                                                            "attributes": {
                                                                "id": "project"
                                                            },
                                                            "content": "<i class=\"fas fa-folder\"></i> <span>Projects</span>"
                                                        }
                                                    ],
                                                    "tagName": "li",
                                                    "content": ""
                                                },
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "a",
                                                            "attributes": {
                                                                "id": "task"
                                                            },
                                                            "content": "<i class=\"fas fa-file\"></i> <span>Tasks</span>"
                                                        }
                                                    ],
                                                    "tagName": "li",
                                                    "content": ""
                                                },
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "a",
                                                            "attributes": {
                                                                "id": "user"
                                                            },
                                                            "content": "<i class=\"fas fa-user\"></i> <span>Users</span>"
                                                        }
                                                    ],
                                                    "tagName": "li",
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "ul",
                                            "attributes": {
                                                "class": "demo-menu"
                                            },
                                            "content": ""
                                        }
                                    ],
                                    "tagName": "nav",
                                    "attributes": {
                                        "class": "demo-sidebar-menu"
                                    },
                                    "content": ""
                                }
                            ],
                            "tagName": "div",
                            "attributes": {
                                "id": "demo-sidebar",
                                "class": "demo-sidebar"
                            },
                            "content": ""
                        },
                        {
                            "type": "containerTag",
                            "children": [
                                {
                                    "type": "containerTag",
                                    "children": [
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h4",
                                                                            "attributes": {
                                                                                "class": "pt-1"
                                                                            },
                                                                            "content": "Project"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "a",
                                                                                    "attributes": {
                                                                                        "id": "project-new",
                                                                                        "class": "btn btn-primary"
                                                                                    },
                                                                                    "content": "<i class=\"fas fa-plus\"></i> New Project"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "d-flex flex-wrap align-items-center"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "d-flex flex-wrap align-items-center justify-content-between"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "id": "project-header",
                                                                "class": "card-body write-card",
                                                                "style": "display: none;"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h4",
                                                                            "attributes": {
                                                                                "class": "pt-1"
                                                                            },
                                                                            "content": "Task"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "a",
                                                                                    "attributes": {
                                                                                        "id": "task-new",
                                                                                        "class": "btn btn-primary"
                                                                                    },
                                                                                    "content": "<i class=\"fas fa-plus\"></i> New Task"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "d-flex flex-wrap align-items-center"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "d-flex flex-wrap align-items-center justify-content-between"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "id": "task-header",
                                                                "class": "card-body write-card",
                                                                "style": "display: none;"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h4",
                                                                            "attributes": {
                                                                                "class": "pt-1"
                                                                            },
                                                                            "content": "User"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "a",
                                                                                    "attributes": {
                                                                                        "id": "user-new",
                                                                                        "class": "btn btn-primary"
                                                                                    },
                                                                                    "content": "<i class=\"fas fa-plus\"></i> New User"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "d-flex flex-wrap align-items-center"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "d-flex flex-wrap align-items-center justify-content-between"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "id": "user-header",
                                                                "class": "card-body write-card",
                                                                "style": "display: none;"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h4",
                                                                            "attributes": {
                                                                                "class": "pt-1"
                                                                            },
                                                                            "content": "Note"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "a",
                                                                                    "attributes": {
                                                                                        "id": "note-new",
                                                                                        "class": "btn btn-primary"
                                                                                    },
                                                                                    "content": "<i class=\"fas fa-plus\"></i> New Note"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "d-flex flex-wrap align-items-center"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "d-flex flex-wrap align-items-center justify-content-between"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "id": "note-header",
                                                                "class": "card-body write-card",
                                                                "style": "display: none;"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h4",
                                                                            "attributes": {
                                                                                "class": "pt-1"
                                                                            },
                                                                            "content": "Timesheet"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "a",
                                                                                    "attributes": {
                                                                                        "id": "timesheet-new",
                                                                                        "class": "btn btn-primary"
                                                                                    },
                                                                                    "content": "<i class=\"fas fa-plus\"></i> New Timesheet"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "d-flex flex-wrap align-items-center"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "d-flex flex-wrap align-items-center justify-content-between"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "id": "timesheet-header",
                                                                "class": "card-body write-card",
                                                                "style": "display: none;"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "card card-block topnav-left"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "class": "d-flex align-items-center justify-content-center"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Add Note"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "note-new-description"
                                                                                                            },
                                                                                                            "content": "Description:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "span",
                                                                                                            "attributes": {
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "*"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "textarea",
                                                                                                            "attributes": {
                                                                                                                "class": "form-control",
                                                                                                                "id": "note-new-description",
                                                                                                                "rows": "3",
                                                                                                                "required": "true"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "small",
                                                                                                            "attributes": {
                                                                                                                "id": "note-new-description-required-label",
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "Required values"
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "note-new-taskId"
                                                                                                            },
                                                                                                            "content": "Task:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-new-taskId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-new-taskId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "note-new-taskId-manage",
                                                                                                                                "disabled": "true"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "note-new-userId"
                                                                                                            },
                                                                                                            "content": "User:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-new-userId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-new-userId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "note-new-userId-manage"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "form",
                                                                                    "attributes": {
                                                                                        "id": "note-new-form-element"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "container-fluid"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "span",
                                                                            "attributes": {
                                                                                "class": "text-danger mr-1"
                                                                            },
                                                                            "content": "*"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "label",
                                                                            "content": "Required values"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-save"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "note-new-form-save",
                                                                                "type": "button",
                                                                                "class": "btn btn-primary"
                                                                            },
                                                                            "content": "Save"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "addNoteModel",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Log Time"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-new-description"
                                                                                                            },
                                                                                                            "content": "Description:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "span",
                                                                                                            "attributes": {
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "*"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "textarea",
                                                                                                            "attributes": {
                                                                                                                "class": "form-control",
                                                                                                                "id": "timesheet-new-description",
                                                                                                                "rows": "3",
                                                                                                                "required": "true"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "small",
                                                                                                            "attributes": {
                                                                                                                "id": "timesheet-new-description-required-label",
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "Required values"
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-new-timeLogged"
                                                                                                            },
                                                                                                            "content": "Time Logged:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "span",
                                                                                                            "attributes": {
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "*"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "input",
                                                                                                            "attributes": {
                                                                                                                "type": "number",
                                                                                                                "class": "form-control",
                                                                                                                "id": "timesheet-new-timeLogged",
                                                                                                                "required": "true"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "small",
                                                                                                            "attributes": {
                                                                                                                "id": "timesheet-new-timeLogged-required-label",
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "Required values"
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-new-taskId"
                                                                                                            },
                                                                                                            "content": "Task:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-new-taskId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-new-taskId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "timesheet-new-taskId-manage",
                                                                                                                                "disabled": "true"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-new-userId"
                                                                                                            },
                                                                                                            "content": "User:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-new-userId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-new-userId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "timesheet-new-userId-manage"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "form",
                                                                                    "attributes": {
                                                                                        "id": "timesheet-new-form-element"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "container-fluid"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "span",
                                                                            "attributes": {
                                                                                "class": "text-danger mr-1"
                                                                            },
                                                                            "content": "*"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "label",
                                                                            "content": "Required values"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-save"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "timesheet-new-form-save",
                                                                                "type": "button",
                                                                                "class": "btn btn-primary"
                                                                            },
                                                                            "content": "Save"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "addLogTimeModel",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Note"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "note-info-id"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "note-info-description"
                                                                                                            },
                                                                                                            "content": "Description:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "span",
                                                                                                            "attributes": {
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "*"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "textarea",
                                                                                                            "attributes": {
                                                                                                                "class": "form-control",
                                                                                                                "id": "note-info-description",
                                                                                                                "rows": "3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "small",
                                                                                                            "attributes": {
                                                                                                                "id": "note-info-description-required-label",
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "Required values"
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "note-info-taskId"
                                                                                                            },
                                                                                                            "content": "Task:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-info-taskId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-info-taskId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "note-info-taskId-manage",
                                                                                                                                "disabled": "true"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "note-info-userId"
                                                                                                            },
                                                                                                            "content": "User:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-info-userId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "note-info-userId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "note-info-userId-manage"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "form",
                                                                                    "attributes": {
                                                                                        "id": "note-information-view-form"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "container-fluid"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "span",
                                                                            "attributes": {
                                                                                "class": "text-danger mr-1"
                                                                            },
                                                                            "content": "*"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "label",
                                                                            "content": "Required values"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-save"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "note-info-update",
                                                                                "type": "button",
                                                                                "class": "btn btn-primary"
                                                                            },
                                                                            "content": "Save"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-trash"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "note-info-delete",
                                                                                "type": "button",
                                                                                "class": "btn btn-danger"
                                                                            },
                                                                            "content": "Delete"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "noteInfoModal",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Timesheet"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "timesheet-info-id"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-info-description"
                                                                                                            },
                                                                                                            "content": "Description:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "span",
                                                                                                            "attributes": {
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "*"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "textarea",
                                                                                                            "attributes": {
                                                                                                                "class": "form-control",
                                                                                                                "id": "timesheet-info-description",
                                                                                                                "rows": "3",
                                                                                                                "required": "true"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "small",
                                                                                                            "attributes": {
                                                                                                                "id": "timesheet-info-description-required-label",
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "Required values"
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-info-timeLogged"
                                                                                                            },
                                                                                                            "content": "Time Logged:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "span",
                                                                                                            "attributes": {
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "*"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "input",
                                                                                                            "attributes": {
                                                                                                                "type": "number",
                                                                                                                "class": "form-control",
                                                                                                                "id": "timesheet-info-timeLogged",
                                                                                                                "required": "true"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "small",
                                                                                                            "attributes": {
                                                                                                                "id": "timesheet-info-timeLogged-required-label",
                                                                                                                "class": "text-danger"
                                                                                                            },
                                                                                                            "content": "Required values"
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-info-taskId"
                                                                                                            },
                                                                                                            "content": "Task:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-info-taskId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-info-taskId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "timesheet-info-taskId-manage",
                                                                                                                                "disabled": "true"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "label",
                                                                                                            "attributes": {
                                                                                                                "for": "timesheet-info-userId"
                                                                                                            },
                                                                                                            "content": "User:"
                                                                                                        },
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "children": [
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "hidden",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-info-userId"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "tagName": "input",
                                                                                                                    "attributes": {
                                                                                                                        "type": "text",
                                                                                                                        "class": "form-control",
                                                                                                                        "id": "timesheet-info-userId-display",
                                                                                                                        "disabled": "true"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                },
                                                                                                                {
                                                                                                                    "type": "containerTag",
                                                                                                                    "children": [
                                                                                                                        {
                                                                                                                            "type": "containerTag",
                                                                                                                            "tagName": "button",
                                                                                                                            "attributes": {
                                                                                                                                "class": "btn btn-primary",
                                                                                                                                "type": "button",
                                                                                                                                "id": "timesheet-info-userId-manage"
                                                                                                                            },
                                                                                                                            "content": "Manage"
                                                                                                                        }
                                                                                                                    ],
                                                                                                                    "tagName": "div",
                                                                                                                    "attributes": {
                                                                                                                        "class": "input-group-append"
                                                                                                                    },
                                                                                                                    "content": ""
                                                                                                                }
                                                                                                            ],
                                                                                                            "tagName": "div",
                                                                                                            "attributes": {
                                                                                                                "class": "input-group mb-3"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "div",
                                                                                                    "attributes": {
                                                                                                        "class": "form-group col-md-12"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "row"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "form",
                                                                                    "attributes": {
                                                                                        "id": "timesheet-information-view-form"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "container-fluid"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "span",
                                                                            "attributes": {
                                                                                "class": "text-danger mr-1"
                                                                            },
                                                                            "content": "*"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "label",
                                                                            "content": "Required values"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-save"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "timesheet-info-update",
                                                                                "type": "button",
                                                                                "class": "btn btn-primary"
                                                                            },
                                                                            "content": "Save"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-trash"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "timesheet-info-delete",
                                                                                "type": "button",
                                                                                "class": "btn btn-danger"
                                                                            },
                                                                            "content": "Delete"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "timeshetInfoModal",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Projects"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "projectModalTable",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/project"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "btn btn-secondary",
                                                                                "data-dismiss": "modal"
                                                                            },
                                                                            "content": "Close"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "btn btn-primary",
                                                                                "id": "projectModalTableApply",
                                                                                "disabled": "true"
                                                                            },
                                                                            "content": "Apply"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog modal-lg",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "projectTableModel",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Tasks"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "taskModalTable",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/task"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "btn btn-secondary",
                                                                                "data-dismiss": "modal"
                                                                            },
                                                                            "content": "Close"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "btn btn-primary",
                                                                                "id": "taskModalTableApply",
                                                                                "disabled": "true"
                                                                            },
                                                                            "content": "Apply"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog modal-lg",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "taskTableModel",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "h5",
                                                                            "attributes": {
                                                                                "class": "modal-title"
                                                                            },
                                                                            "content": "Users"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "aria-hidden": "true"
                                                                                    },
                                                                                    "content": "\u00d7"
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "close",
                                                                                "data-dismiss": "modal",
                                                                                "aria-label": "Close"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-header"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "userModalTable",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/user"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-body"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "btn btn-secondary",
                                                                                "data-dismiss": "modal"
                                                                            },
                                                                            "content": "Close"
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "type": "button",
                                                                                "class": "btn btn-primary",
                                                                                "id": "userModalTableApply",
                                                                                "disabled": "true"
                                                                            },
                                                                            "content": "Apply"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "modal-footer"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "modal-content"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "modal-dialog modal-lg",
                                                        "role": "document"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "userTableModel",
                                                "class": "modal fade",
                                                "tabindex": "-1",
                                                "role": "dialog"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "project-table",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/project"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "project-table-container",
                                                                        "class": "card-body write-card",
                                                                        "style": "display: none;"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "label",
                                                                                            "attributes": {
                                                                                                "class": "pt-2 mr-3"
                                                                                            },
                                                                                            "content": "Filter By:"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "task-table-assignedUserId"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-table-assignedUserId-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-table-assignedUserId-manage"
                                                                                                    },
                                                                                                    "content": "Assignee"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append mr-1"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "children": [
                                                                                                        {
                                                                                                            "type": "containerTag",
                                                                                                            "tagName": "i",
                                                                                                            "attributes": {
                                                                                                                "class": "fas fa-times"
                                                                                                            },
                                                                                                            "content": ""
                                                                                                        }
                                                                                                    ],
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary d-none",
                                                                                                        "type": "button",
                                                                                                        "id": "task-table-remove-filter"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append mr-1"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group mb-3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "id": "task-table-toolbar"
                                                                            },
                                                                            "content": ""
                                                                        },
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "task-table",
                                                                                "data-toolbar": "#task-table-toolbar",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-filter-control": "true"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "task-table-container",
                                                                        "class": "card-body write-card",
                                                                        "style": "display: none;"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "user-table",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/user"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "user-table-container",
                                                                        "class": "card-body write-card",
                                                                        "style": "display: none;"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "note-table",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/note"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "note-table-container",
                                                                        "class": "card-body write-card",
                                                                        "style": "display: none;"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "table",
                                                                            "attributes": {
                                                                                "id": "timesheet-table",
                                                                                "data-search": "true",
                                                                                "data-show-fullscreen": "true",
                                                                                "data-side-pagination": "server",
                                                                                "data-pagination": "true",
                                                                                "data-url": "/api/demo_api_tasks/1.0/timesheet"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "timesheet-table-container",
                                                                        "class": "card-body write-card",
                                                                        "style": "display: none;"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "card card-block topnav-left"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "class": "d-flex align-items-center justify-content-center"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "task-management-table",
                                                "class": "container-fluid mt-3 p-0"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-new-name"
                                                                                    },
                                                                                    "content": "Name:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "project-new-name",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "project-new-name-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-new-code"
                                                                                    },
                                                                                    "content": "Code:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "project-new-code",
                                                                                        "maxlength": "12",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "project-new-code-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group required col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-new-status"
                                                                                    },
                                                                                    "content": "Status:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Not Started"
                                                                                            },
                                                                                            "content": "Not Started"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "In Progress"
                                                                                            },
                                                                                            "content": "In Progress"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Completed"
                                                                                            },
                                                                                            "content": "Completed"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Closed"
                                                                                            },
                                                                                            "content": "Closed"
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "select",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "project-new-status"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-new-description"
                                                                                    },
                                                                                    "content": "Description:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "textarea",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "project-new-description",
                                                                                        "rows": "3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-new-deadline"
                                                                                    },
                                                                                    "content": "Deadline:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "date",
                                                                                        "class": "form-control",
                                                                                        "id": "project-new-deadline",
                                                                                        "onkeydown": "preventKeyEvent(event)",
                                                                                        "onkeypress": "preventKeyEvent(event)"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-save"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "project-new-form-save",
                                                                        "type": "button",
                                                                        "class": "btn btn-primary"
                                                                    },
                                                                    "content": "Save"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger mr-1"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row mt-3"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "form",
                                                            "attributes": {
                                                                "id": "project-new-form-element"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "id": "project-new-form",
                                                        "class": "card-body write-card",
                                                        "style": "display: none;"
                                                    },
                                                    "content": ""
                                                },
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-subject"
                                                                                    },
                                                                                    "content": "Subject:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "task-new-subject",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "task-new-subject-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-status"
                                                                                    },
                                                                                    "content": "Status:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Not Started"
                                                                                            },
                                                                                            "content": "Not Started"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "In Progress"
                                                                                            },
                                                                                            "content": "In Progress"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Completed"
                                                                                            },
                                                                                            "content": "Completed"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Closed"
                                                                                            },
                                                                                            "content": "Closed"
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "select",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "task-new-status"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-description"
                                                                                    },
                                                                                    "content": "Description:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "textarea",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "task-new-description",
                                                                                        "rows": "3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-deadline"
                                                                                    },
                                                                                    "content": "Deadline:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "date",
                                                                                        "class": "form-control",
                                                                                        "id": "task-new-deadline",
                                                                                        "onkeydown": "preventKeyEvent(event)",
                                                                                        "onkeypress": "preventKeyEvent(event)"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-projectId"
                                                                                    },
                                                                                    "content": "Project:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control input-hidden",
                                                                                                "id": "task-new-projectId"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-new-projectId-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-new-projectId-manage"
                                                                                                    },
                                                                                                    "content": "Manage"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "task-new-projectId-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-assignedUserId"
                                                                                    },
                                                                                    "content": "Assignee:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "task-new-assignedUserId"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-new-assignedUserId-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-new-assignedUserId-manage"
                                                                                                    },
                                                                                                    "content": "Manage"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group mb-3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-new-dependencyTask"
                                                                                    },
                                                                                    "content": "Optional: This Task is Dependent on:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "task-new-dependencyTask"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-new-dependencyTask-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-new-dependencyTask-manage"
                                                                                                    },
                                                                                                    "content": "Manage"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group mb-3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-save"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "task-new-form-save",
                                                                        "type": "button",
                                                                        "class": "btn btn-primary"
                                                                    },
                                                                    "content": "Save"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger mr-1"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row mt-3"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "form",
                                                            "attributes": {
                                                                "id": "task-new-form-element"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "id": "task-new-form",
                                                        "class": "card-body write-card",
                                                        "style": "display: none;"
                                                    },
                                                    "content": ""
                                                },
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "user-new-first-name"
                                                                                    },
                                                                                    "content": "First Name:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "user-new-first-name",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "user-new-first-name-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "user-new-last-name"
                                                                                    },
                                                                                    "content": "Last Name:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "user-new-last-name",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "user-new-last-name-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "user-new-email"
                                                                                    },
                                                                                    "content": "Email:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "email",
                                                                                        "class": "form-control",
                                                                                        "id": "user-new-email",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "user-new-email-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-save"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "user-new-form-save",
                                                                        "type": "button",
                                                                        "class": "btn btn-primary"
                                                                    },
                                                                    "content": "Save"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger mr-1"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row mt-3"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "form",
                                                            "attributes": {
                                                                "id": "user-new-form-element"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "id": "user-new-form",
                                                        "class": "card-body write-card",
                                                        "style": "display: none;"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "task-management-new-form",
                                                "class": "container-fluid mt-3 p-0"
                                            },
                                            "content": ""
                                        },
                                        {
                                            "type": "containerTag",
                                            "children": [
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "tagName": "input",
                                                                    "attributes": {
                                                                        "type": "hidden",
                                                                        "class": "form-control",
                                                                        "id": "project-info-id"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-info-name"
                                                                                    },
                                                                                    "content": "Name:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "project-info-name",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "project-info-name-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-info-code"
                                                                                    },
                                                                                    "content": "Code:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "project-info-code",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "project-info-code-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-info-status"
                                                                                    },
                                                                                    "content": "Status:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Not Started"
                                                                                            },
                                                                                            "content": "Not Started"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "In Progress"
                                                                                            },
                                                                                            "content": "In Progress"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Completed"
                                                                                            },
                                                                                            "content": "Completed"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Closed"
                                                                                            },
                                                                                            "content": "Closed"
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "select",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "project-info-status"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-info-description"
                                                                                    },
                                                                                    "content": "Description:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "textarea",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "project-info-description",
                                                                                        "rows": "3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "project-info-deadline"
                                                                                    },
                                                                                    "content": "Deadline:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "date",
                                                                                        "class": "form-control",
                                                                                        "id": "project-info-deadline",
                                                                                        "onkeydown": "preventKeyEvent(event)",
                                                                                        "onkeypress": "preventKeyEvent(event)"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-save"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "project-info-update",
                                                                        "type": "button",
                                                                        "class": "btn btn-primary"
                                                                    },
                                                                    "content": "Save"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-trash"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "project-info-delete",
                                                                        "type": "button",
                                                                        "class": "btn btn-danger"
                                                                    },
                                                                    "content": "Delete"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger mr-1"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row mt-3"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "form",
                                                            "attributes": {
                                                                "id": "project-information-view-form"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "br",
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "hr",
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "h4",
                                                            "attributes": {
                                                                "class": "pt-1 mb-3 pl-3"
                                                            },
                                                            "content": "Project Tasks"
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "class": "pt-2 mr-3"
                                                                                    },
                                                                                    "content": "Filter By:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "hidden",
                                                                                        "class": "form-control",
                                                                                        "id": "project-task-table-assignedUserId"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "project-task-table-assignedUserId-display",
                                                                                        "disabled": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "button",
                                                                                            "attributes": {
                                                                                                "class": "btn btn-primary",
                                                                                                "type": "button",
                                                                                                "id": "project-task-table-assignedUserId-manage"
                                                                                            },
                                                                                            "content": "Assignee"
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group-append mr-1"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "i",
                                                                                                    "attributes": {
                                                                                                        "class": "fas fa-times"
                                                                                                    },
                                                                                                    "content": ""
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "button",
                                                                                            "attributes": {
                                                                                                "class": "btn btn-primary d-none",
                                                                                                "type": "button",
                                                                                                "id": "project-task-table-remove-filter"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group-append mr-1"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "input-group mb-3"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "project-task-table-toolbar"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "tagName": "table",
                                                                    "attributes": {
                                                                        "id": "project-task-table",
                                                                        "data-toolbar": "#project-task-table-toolbar",
                                                                        "data-side-pagination": "server",
                                                                        "data-pagination": "true"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "container-fluid"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "id": "project-information-view",
                                                        "class": "card-body write-card",
                                                        "style": "display: none;"
                                                    },
                                                    "content": ""
                                                },
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "tagName": "input",
                                                                    "attributes": {
                                                                        "type": "hidden",
                                                                        "class": "form-control",
                                                                        "id": "task-info-id"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-subject"
                                                                                    },
                                                                                    "content": "Subject:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "task-info-subject",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "task-info-subject-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-status"
                                                                                    },
                                                                                    "content": "Status:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Not Started"
                                                                                            },
                                                                                            "content": "Not Started"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "In Progress"
                                                                                            },
                                                                                            "content": "In Progress"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Completed"
                                                                                            },
                                                                                            "content": "Completed"
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "option",
                                                                                            "attributes": {
                                                                                                "value": "Closed"
                                                                                            },
                                                                                            "content": "Closed"
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "select",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "task-info-status"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-description"
                                                                                    },
                                                                                    "content": "Description:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "textarea",
                                                                                    "attributes": {
                                                                                        "class": "form-control",
                                                                                        "id": "task-info-description",
                                                                                        "rows": "3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-deadline"
                                                                                    },
                                                                                    "content": "Deadline:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "date",
                                                                                        "class": "form-control",
                                                                                        "id": "task-info-deadline",
                                                                                        "onkeydown": "preventKeyEvent(event)",
                                                                                        "onkeypress": "preventKeyEvent(event)"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-projectId"
                                                                                    },
                                                                                    "content": "Project:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "task-info-projectId"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-info-projectId-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-info-projectId-manage"
                                                                                                    },
                                                                                                    "content": "Manage"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "task-info-projectId-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-assignedUserId"
                                                                                    },
                                                                                    "content": "Assignee:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "task-info-assignedUserId"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-info-assignedUserId-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-info-assignedUserId-manage"
                                                                                                    },
                                                                                                    "content": "Manage"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group mb-3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "task-info-dependencyTask"
                                                                                    },
                                                                                    "content": "Optional: This Task is Dependent on:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "children": [
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "hidden",
                                                                                                "class": "form-control",
                                                                                                "id": "task-info-dependencyTask"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "tagName": "input",
                                                                                            "attributes": {
                                                                                                "type": "text",
                                                                                                "class": "form-control",
                                                                                                "id": "task-info-dependencyTask-display",
                                                                                                "disabled": "true"
                                                                                            },
                                                                                            "content": ""
                                                                                        },
                                                                                        {
                                                                                            "type": "containerTag",
                                                                                            "children": [
                                                                                                {
                                                                                                    "type": "containerTag",
                                                                                                    "tagName": "button",
                                                                                                    "attributes": {
                                                                                                        "class": "btn btn-primary",
                                                                                                        "type": "button",
                                                                                                        "id": "task-info-dependencyTask-manage"
                                                                                                    },
                                                                                                    "content": "Manage"
                                                                                                }
                                                                                            ],
                                                                                            "tagName": "div",
                                                                                            "attributes": {
                                                                                                "class": "input-group-append"
                                                                                            },
                                                                                            "content": ""
                                                                                        }
                                                                                    ],
                                                                                    "tagName": "div",
                                                                                    "attributes": {
                                                                                        "class": "input-group mb-3"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-save"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "task-info-update",
                                                                        "type": "button",
                                                                        "class": "btn btn-primary"
                                                                    },
                                                                    "content": "Save"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-trash"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "task-info-delete",
                                                                        "type": "button",
                                                                        "class": "btn btn-danger"
                                                                    },
                                                                    "content": "Delete"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger mr-1"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row mt-3"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "form",
                                                            "attributes": {
                                                                "id": "task-information-view-form"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "br",
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "hr",
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "h4",
                                                            "attributes": {
                                                                "class": "pt-1 mb-3 pl-3"
                                                            },
                                                            "content": "Notes"
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-plus"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "task-note-table-toolbar-add",
                                                                                "type": "button",
                                                                                "class": "btn btn-primary"
                                                                            },
                                                                            "content": "Add Note"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "task-note-table-toolbar"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "tagName": "table",
                                                                    "attributes": {
                                                                        "id": "task-note-table",
                                                                        "data-toolbar": "#task-note-table-toolbar",
                                                                        "data-side-pagination": "server",
                                                                        "data-pagination": "true"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "container-fluid"
                                                            },
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "br",
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "hr",
                                                            "content": ""
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "tagName": "h4",
                                                            "attributes": {
                                                                "class": "pt-1 mb-3 pl-3"
                                                            },
                                                            "content": "Timesheets"
                                                        },
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "i",
                                                                                    "attributes": {
                                                                                        "class": "fas fa-plus"
                                                                                    },
                                                                                    "content": ""
                                                                                }
                                                                            ],
                                                                            "tagName": "button",
                                                                            "attributes": {
                                                                                "id": "task-timesheet-table-toolbar-add",
                                                                                "type": "button",
                                                                                "class": "btn btn-primary"
                                                                            },
                                                                            "content": "Log Time"
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "id": "task-timesheet-table-toolbar"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "tagName": "table",
                                                                    "attributes": {
                                                                        "id": "task-timesheet-table",
                                                                        "data-toolbar": "#task-timesheet-table-toolbar",
                                                                        "data-side-pagination": "server",
                                                                        "data-pagination": "true"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "div",
                                                            "attributes": {
                                                                "class": "container-fluid"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "id": "task-information-view",
                                                        "class": "card-body write-card",
                                                        "style": "display: none;"
                                                    },
                                                    "content": ""
                                                },
                                                {
                                                    "type": "containerTag",
                                                    "children": [
                                                        {
                                                            "type": "containerTag",
                                                            "children": [
                                                                {
                                                                    "type": "containerTag",
                                                                    "tagName": "input",
                                                                    "attributes": {
                                                                        "type": "hidden",
                                                                        "class": "form-control",
                                                                        "id": "user-info-id"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "user-info-first-name"
                                                                                    },
                                                                                    "content": "First Name:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "user-info-first-name",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "user-info-first-name-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "user-info-last-name"
                                                                                    },
                                                                                    "content": "Last Name:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "user-info-last-name",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "user-info-last-name-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "attributes": {
                                                                                        "for": "user-info-email"
                                                                                    },
                                                                                    "content": "Email:"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "input",
                                                                                    "attributes": {
                                                                                        "type": "text",
                                                                                        "class": "form-control",
                                                                                        "id": "user-info-email",
                                                                                        "required": "true"
                                                                                    },
                                                                                    "content": ""
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "small",
                                                                                    "attributes": {
                                                                                        "id": "user-info-email-required-label",
                                                                                        "class": "text-danger"
                                                                                    },
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row"
                                                                    },
                                                                    "content": ""
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-save"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "user-info-update",
                                                                        "type": "button",
                                                                        "class": "btn btn-primary"
                                                                    },
                                                                    "content": "Save"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "tagName": "i",
                                                                            "attributes": {
                                                                                "class": "fas fa-trash"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "button",
                                                                    "attributes": {
                                                                        "id": "user-info-delete",
                                                                        "type": "button",
                                                                        "class": "btn btn-danger"
                                                                    },
                                                                    "content": "Delete"
                                                                },
                                                                {
                                                                    "type": "containerTag",
                                                                    "children": [
                                                                        {
                                                                            "type": "containerTag",
                                                                            "children": [
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "span",
                                                                                    "attributes": {
                                                                                        "class": "text-danger mr-1"
                                                                                    },
                                                                                    "content": "*"
                                                                                },
                                                                                {
                                                                                    "type": "containerTag",
                                                                                    "tagName": "label",
                                                                                    "content": "Required values"
                                                                                }
                                                                            ],
                                                                            "tagName": "div",
                                                                            "attributes": {
                                                                                "class": "form-group col-md-6"
                                                                            },
                                                                            "content": ""
                                                                        }
                                                                    ],
                                                                    "tagName": "div",
                                                                    "attributes": {
                                                                        "class": "row mt-3"
                                                                    },
                                                                    "content": ""
                                                                }
                                                            ],
                                                            "tagName": "form",
                                                            "attributes": {
                                                                "id": "user-information-view-form"
                                                            },
                                                            "content": ""
                                                        }
                                                    ],
                                                    "tagName": "div",
                                                    "attributes": {
                                                        "id": "user-information-view",
                                                        "class": "card-body write-card",
                                                        "style": "display: none;"
                                                    },
                                                    "content": ""
                                                }
                                            ],
                                            "tagName": "div",
                                            "attributes": {
                                                "id": "task-management-information-view",
                                                "class": "container-fluid mt-3 p-0"
                                            },
                                            "content": ""
                                        }
                                    ],
                                    "tagName": "div",
                                    "attributes": {
                                        "class": "container-fluid"
                                    },
                                    "content": ""
                                }
                            ],
                            "tagName": "div",
                            "attributes": {
                                "class": "demo-content"
                            },
                            "content": ""
                        }
                    ],
                    "tagName": "div",
                    "content": ""
                },
                {
                    "type": "containerTag",
                    "tagName": "script",
                    "attributes": {
                        "src": "https://code.jquery.com/jquery-3.5.1.min.js",
                        "crossorigin": "anonymous"
                    },
                    "content": ""
                },
                {
                    "type": "containerTag",
                    "tagName": "script",
                    "attributes": {
                        "src": "https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js",
                        "integrity": "sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns",
                        "crossorigin": "anonymous"
                    },
                    "content": ""
                },
                {
                    "type": "containerTag",
                    "tagName": "script",
                    "attributes": {
                        "src": "https://unpkg.com/bootstrap-table@1.18.3/dist/bootstrap-table.min.js"
                    },
                    "content": ""
                },
                {
                    "type": "containerTag",
                    "tagName": "script",
                    "attributes": {
                        "src": "https://cdn.jsdelivr.net/npm/bootstrap-notify@3.1.3/bootstrap-notify.min.js"
                    },
                    "content": ""
                },
                {
                    "type": "containerTag",
                    "tagName": "script",
                    "attributes": {
                        "src": "https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js",
                        "integrity": "sha512-qTXRIMyZIFb8iQcfjXWCO8+M5Tbc38Qi5WzdPOYZHIlZpzBHG3L3by84BBBOiRGiEb7KKtAOAs5qYdUiZiQNNQ==",
                        "crossorigin": "anonymous"
                    },
                    "content": ""
                },
                {
                    "type": "containerTag",
                    "tagName": "script",
                    "attributes": {
                        "src": "/demo-api-tasks/script.js"
                    },
                    "content": ""
                }
            ],
            "tagName": "body",
            "attributes": {
                "class": "demo"
            },
            "content": ""
        }
    ]
}