# SWIFT Message Parser & Validator

## Introduction

## Directory Structure

##### src/main/antlr4
Contains the grammars used to parse SWIFT MT messages and field validation formats.

##### src/main/generated
Contains the antlr generated classes 

## Examples

1. Multiline validation rule.
    
    For a given input `[/1!a][/34x]\r\n4!a2!a2!c[3c]` (such that of `MT300 Field 84A`) the parser parses this into 
    the following AST (Abstract Syntax Tree).
    
    ![Multiline Validation Rule](/docs/multiline-val-parse-tree.png)

2. Combined Mandatory and optional subfields

    For a given input `6a[/8!n][//4!n]`. The parser parses this as:
    
    ![Combined Mandatory and Optional Rule](/docs/mandatory-with-optional.png)
    


