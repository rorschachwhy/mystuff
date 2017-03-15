from django.shortcuts import render


def index(request):
    return render(request, 'blog3/index.html', {'hello': 'Hello , Blog3!'})
