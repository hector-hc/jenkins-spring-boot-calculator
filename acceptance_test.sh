#!/bin/bash
test $(curl localhost:8081/calculator/sum?a=1\&b=2) -eq 3