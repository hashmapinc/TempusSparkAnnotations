#!/usr/bin/env bash
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc -K $encrypted_ea12e2ceac9b_key -iv $encrypted_ea12e2ceac9b_iv -in cd/codeSignKey.asc.enc -out cd/codeSignKey.asc -d
    gpg --fast-import cd/codeSignKey.asc
fi
