const app = angular.module("ProductsManagement", ["ngRoute"]);

app.config(function($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl : "/online-store/static/components/products.html",
            controller:'ProductsController'
        })
        .when("/product/:id", {
            templateUrl : "/online-store/static/components/product.html",
            controller:'ProductController'
        })
});

app.controller("ProductController", function($scope, $http) {
    $scope.productData = [];

    const currentURL = window.location.href
    const productID = currentURL.substr(currentURL.lastIndexOf('/') + 1)
    getProductInfo(productID);

    $scope.goHome = function () {
        goHome();
    }

    function getProductInfo(productID) {
        console.log('productID: ' + productID)
        $http({
            method: 'POST',
            data: productID,
            url: '/online-store/api/products/product/'
        }).then(
            function(response) { // success
                console.log(response.data)
                $scope.productData = response.data;
            },
            function(response) { // error
                console.log("Error: " + response.status + " : " + response.data);
            }
        );
    }

    function goHome() {
        window.location.href = 'http://localhost:8080/online-store/#!/'
    }

});

app.controller("ProductsController", function($scope, $http) {
    $scope.products = [];

    $scope.openProductPage = function(productID) {
        openProductPage(productID);
    }

    getAllProducts();

    function getAllProducts() {
        $http({
            method: 'GET',
            url: '/online-store/api/products'
        }).then(
            function(response) { // success
                $scope.products = response.data;
            },
            function(response) { // error
                console.log("Error: " + response.status + " : " + response.data);
            }
        );
    }

    function openProductPage(productID) {
        console.log(productID)
        console.log(window.location.href)

        let currentUrl = window.location.href
        window.location.href = currentUrl + 'product/' + productID
    }
});