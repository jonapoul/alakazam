#!/bin/bash

# Clean any previous Dokka docs
rm -rf docs/api

# Build the docs
./gradlew clean dokkaHtmlMultiModule

# Copy outside files into the docs folder
mkdir -p docs
cp README.md docs/index.md

# Deploy to Github pages
pip3 install mkdocs
pip3 install mkdocs-material
pip3 install mkdocs-redirects
pip3 install mkdocs-git-revision-date-plugin
python3 -m mkdocs gh-deploy

# Clean up
rm docs/index.md \
   docs/contributing.md \
   docs/changelog.md \
   docs/compose.md \
   docs/logo.svg \
   docs/gifs.md \
   docs/svgs.md \
   docs/testing.md \
   docs/videos.md \
   docs/README-ja.md \
   docs/README-ko.md \
   docs/README-tr.md \
   docs/README-zh.md
rm -r docs/api
rm -r site
