using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Animation : MonoBehaviour
{
    public float jumpPower;
    public int jumpKeyCount;
    public int downKeyCount;

    public Rigidbody2D rigid;
    public Animator anim;
    public Transform trans;


    void FixedUpdate()
    {
        Debug.DrawRay(rigid.position, Vector3.down, new Color(0, 1, 0));

        if (rigid.velocity.y < 0)
        {
            RaycastHit2D rayHit = Physics2D.Raycast(rigid.position, Vector3.down, 2.5f, LayerMask.GetMask("Platform"));

            if (rayHit.collider != null)
            {
                anim.SetBool("isIdle", true);
                Debug.Log(rayHit.collider.name);
            }
        }
    }

    public void UpAnimation()
    {
        if (anim.GetBool("isIdle"))
        {
            anim.SetBool("isIdle", false);
        }
        downKeyCount = 0;
        rigid.MovePosition(new Vector2(0, 9));
        rigid.velocity = Vector2.zero;

        if (jumpKeyCount == 0)
            anim.SetTrigger("isJump");


        if (jumpKeyCount == 1)
        {
            anim.SetTrigger("isJump2");
            jumpKeyCount = 0;
            return;
        }
        jumpKeyCount++;
    }

    public void DownAnimation()
    {
        if (anim.GetBool("isIdle"))
        {
            anim.SetBool("isIdle", false);
        }
        jumpKeyCount = 0;
        rigid.MovePosition(new Vector2(0, 1));
        rigid.velocity = Vector2.zero;

        if (downKeyCount == 0)
            anim.SetTrigger("isDown");


        if (downKeyCount == 1)
        {
            anim.SetTrigger("isDown2");
            downKeyCount = 0;
            return;
        }
        downKeyCount++;
    }
}
