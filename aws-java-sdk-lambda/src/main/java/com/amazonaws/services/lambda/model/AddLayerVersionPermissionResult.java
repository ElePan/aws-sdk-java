/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddLayerVersionPermission" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddLayerVersionPermissionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The permission statement.
     * </p>
     */
    private String statement;
    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The permission statement.
     * </p>
     * 
     * @param statement
     *        The permission statement.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The permission statement.
     * </p>
     * 
     * @return The permission statement.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The permission statement.
     * </p>
     * 
     * @param statement
     *        The permission statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionResult withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current revision of the policy.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     * 
     * @return A unique identifier for the current revision of the policy.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current revision of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddLayerVersionPermissionResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatement() != null)
            sb.append("Statement: ").append(getStatement()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddLayerVersionPermissionResult == false)
            return false;
        AddLayerVersionPermissionResult other = (AddLayerVersionPermissionResult) obj;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public AddLayerVersionPermissionResult clone() {
        try {
            return (AddLayerVersionPermissionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
