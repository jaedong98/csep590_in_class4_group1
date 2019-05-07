#!/bin/sh

git diff --no-index --unified=0 src/triangle/Triangle.java .mutated/mutants/$1/triangle/Triangle.java
