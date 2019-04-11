#
# Copyright (c) 2010, Pismo Labs Limited
#
# All rights reserved.
#
SHELL := /bin/bash

TOP=.

export BASEDIR=$(PWD)

target:
	@echo -e "\nGenerating tiny-ros..."
	@if [ -d $(BASEDIR)/build/output ]; then \
		rm -rf $(BASEDIR)/build/output; \
	fi
	@if [ -d $(BASEDIR)/build/CMake ]; then \
		rm -rf $(BASEDIR)/build/CMake; \
	fi
	@mkdir -p $(BASEDIR)/build/CMake
	@python $(BASEDIR)/tools/scripts/make_library_gcc.py $(BASEDIR) $(BASEDIR)/build/output
	@python $(BASEDIR)/tools/scripts/make_library_java.py $(BASEDIR) $(BASEDIR)/build/output
	@cd $(BASEDIR)/build/CMake; cmake $(BASEDIR); make
	
clean:
	@if [ -d $(BASEDIR)/build/output ]; then \
		rm -rf $(BASEDIR)/build/output; \
	fi
	@if [ -d $(BASEDIR)/build/CMake ]; then \
		rm -rf $(BASEDIR)/build/CMake; \
	fi
