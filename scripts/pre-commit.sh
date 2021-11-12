#!/bin/sh

echo "Running static analysis..."

OUTPUT="build/static-analysis"
cd android-client
mkdir -p build
./gradlew ktlintFormat spotlessApply detekt lint --daemon > ${OUTPUT}
EXIT_CODE=$?
if [ ${EXIT_CODE} -ne 0 ]; then
    cat ${OUTPUT}
    rm -rf ${OUTPUT}
    echo "*********************************************"
    echo "            Static Analysis Failed           "
    echo "Please fix the above issues before committing"
    echo "*********************************************"
    exit ${EXIT_CODE}
else
    rm ${OUTPUT}
    echo "*********************************************"
    echo "          Static Analysis Success!           "
    echo "*********************************************"
fi
