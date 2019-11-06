var app = angular.module("EmployeeManagement", []);

app.controller("EmployeeController", function($scope, $http) {

    $scope.employees = [];
    $scope.employeeForm = {
        empId: 1,
        empNo: "",
        empName: "",
        empAddress: "",
        position: ""
    };

    _refreshEmployeeData();

    $scope.submitEmployee = function() {

        var method = "";
        var url = "";

        if ($scope.employeeForm.empId == -1) {
            method = "POST";
            url = '/employee';
        } else {
            method = "PUT";
            url = '/employee';
        }

        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.employeeForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    $scope.createEmployee = function() {
        _clearFormData();
    }

    $scope.deleteEmployee = function(employee) {
        $http({
            method: 'DELETE',
            url: '/employee/' + employee.empId
        }).then(_success, _error);
    };

    $scope.editEmployee = function(employee) {
        $scope.employeeForm.empId = employee.empId;
        $scope.employeeForm.empNo = employee.empNo;
        $scope.employeeForm.empName = employee.empName;
        $scope.employeeForm.empAddress= employee.empAddress;
        $scope.employeeForm.position = employee.position;
    };

    function _refreshEmployeeData() {
        $http({
            method: 'GET',
            url: '/employees'
        }).then(
            function(res) {
                $scope.employees = res.data;
            },
            function(res) {
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }

    function _success(res) {
        _refreshEmployeeData();
        _clearFormData();
    }

    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }

    function _clearFormData() {
        $scope.employeeForm.empId = -1;
        $scope.employeeForm.empNo = "";
        $scope.employeeForm.empName = "";
        $scope.employeeForm.empAddress= "";
        $scope.employeeForm.position = ""
    };
});
